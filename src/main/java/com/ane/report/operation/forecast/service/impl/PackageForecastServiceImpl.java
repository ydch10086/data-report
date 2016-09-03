package com.ane.report.operation.forecast.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.forecast.dao.IPackageForecastDao;
import com.ane.report.operation.forecast.model.BasicPackage;
import com.ane.report.operation.forecast.model.PackageForecast;
import com.ane.report.operation.forecast.service.IPackageForecastService;
import com.github.pagehelper.PageHelper;

@Service("packageForecastService")
public class PackageForecastServiceImpl implements IPackageForecastService{
	@Resource
	private IPackageForecastDao packageForecastDao;

	private static Logger log = LoggerFactory.getLogger(PackageForecastServiceImpl.class);

	public PagedResult<PackageForecast> queryDataByPage(PackageForecast packageForecast, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize); 
		if(packageForecast!=null){
			//0:未发，1已发，2已到达
			String carStatus = packageForecast.getCarStatus();
			if("0".equals(carStatus)){
				packageForecast.setLoadCarTaskNum(carStatus);
			}
			if("1".equals(carStatus)){
				packageForecast.setCarDepartTaskNum(carStatus);
			}
			if("2".equals(carStatus)){
				packageForecast.setCarUnloadTaskNum(carStatus);
			}
		}	
		//装车表数据
		PagedResult<PackageForecast>  foreCastPageList =  BeanUtil.toPagedResult(packageForecastDao.queryDataByPage(packageForecast));
		List<PackageForecast>   foreCastList = foreCastPageList.getDataList();
		if(!CollectionUtils.isEmpty(foreCastList)){
			for(int i=0;i<foreCastList.size();i++){
				Map<String, Object> map = new HashMap<String, Object>();
				Map<String, Object> carDepartMap = new HashMap<String, Object>();
				Map<String, Object> unloadCarMap = new HashMap<String, Object>();
				PackageForecast entity = foreCastList.get(i);
				if(entity!=null){
					String carNum = entity.getCarNum();
					String taskNum = entity.getTaskNum();
					Integer nextSiteId = entity.getNextSiteId();
					map.put("carNum", carNum);
					map.put("taskNum", taskNum);
					map.put("nextSiteId", nextSiteId);
					Long sumVolume = getSumVolumeForTaskNum(map,taskNum);
					entity.setSumVolume(sumVolume);
					JSONObject jo = JSONObject.fromObject(map);
					if(jo!=null && jo.size()>0){
						entity.setJsonQueryData(jo.toString());
					}
					if(StringUtils.isEmpty(taskNum)){
						entity.setCarStatus("未发车");
					}else 
					{
						try {
							carDepartMap.put("taskNum", taskNum);
							unloadCarMap.put("taskNum", taskNum);
							//发车表记录
							Integer result = packageForecastDao.queryCarDepartCountByParams(carDepartMap);
							//卸车表记录
							Integer unloadResult =packageForecastDao.queryUnloadCarCountByParams(unloadCarMap);
							if(result>0){
								if(unloadResult>0){
									entity.setCarStatus("已到达");
								}else{
									entity.setCarStatus("已发车");
								}
							}else{
								if(unloadResult>0){
									entity.setCarStatus("已到达");
								}else{
									entity.setCarStatus("已发车");
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
							log.error("{}",e);
						}
					}
				}
			}
		}
		
		return foreCastPageList;
	};
	@Override
	public List<BasicPackage> queryPackageDataParams(Map<String, Object> map) {
		List<BasicPackage> packageList = null;
		packageList = packageForecastDao.queryPackageDataParams(map);
		return packageList;
	};
	
	/**
	 * 通过taskNum,carNum,nextSiteId获取相关车辆货量总容积
	 * @param taskNum
	 * @return
	 */
    public Long getSumVolumeForTaskNum(Map<String, Object> carMap,String taskNum){
    	Long sumVolume=0L;
    	if(!StringUtils.isEmpty(taskNum)){
			List<PackageForecast> packBarList= packageForecastDao.queryDataByMapParams(carMap);
			sumVolume = getVolumeToPackBarList(packBarList);
		}
    	return sumVolume;
    };
    
    /**
     * 获取多个集包的容量总和
     * @param packBarList
     * @return
     */
	public Long getVolumeToPackBarList(List<PackageForecast> packBarList){
		Long sumVolume=0L;
		//存放容积
		List<Long> volumeList = new ArrayList<Long>();
		if(!CollectionUtils.isEmpty(packBarList)){
			for(int j=0;j<packBarList.size();j++){
				PackageForecast foreCastBean = packBarList.get(j);
				String packBarCode = foreCastBean.getPackBarCode();
				if(!StringUtils.isEmpty(packBarCode)){
					Map<String,Object> packageMap = new HashMap<String, Object>();
					Long packSizeValue = getPackSize(packBarCode);
					Long packTypeValue = getPackType(packBarCode);
					packageMap.put("packType", packTypeValue);
					packageMap.put("packSize", packSizeValue);
					List<BasicPackage>  packageList= packageForecastDao.queryPackageDataParams(packageMap);
					if(!CollectionUtils.isEmpty(packageList)){
						BasicPackage packageBean = packageList.get(0);
						Long maxVolValue=0l;
						if(packageBean!=null){
							maxVolValue = packageBean.getMaxVol();
							if(maxVolValue!=null){
								volumeList.add(maxVolValue);
							}
							
						}
					}
				}
			}
		}
	    if(volumeList!=null && volumeList.size()>0){
	    	 Long volumeValue =0l;
			  for(int k=0;k<volumeList.size();k++){
				 volumeValue =  volumeList.get(k);
				 if(volumeValue!=null){
					 sumVolume=sumVolume+volumeValue;
				 }
			  }
		  }
	    return sumVolume;
	};
	
	public static Long getPackSize(String billNo){
		Long pageSize =0l;
		if(billNo != null && billNo.length() == 13){
			char c = billNo.charAt(2);
			// 先转换成String类型：
			String s = String.valueOf(c);
			// 再转换成Int类型：
			int i = Integer.parseInt(s);
			if(i == 7){
				pageSize=275L;
			}else if(i == 8){
				pageSize=274L;
			}else if(i == 9){
				pageSize=273L;
			}
		}
		
		return pageSize;
	};
	
	/**
	 * 根据单号返回单号详情（集包号或运单号，以及单号类型） 
	 * 对应丞风数据字典类型
	 * 
	 * @param Str
	 * @return
	 */
	public static Long getPackType(String billNo) {

		Long packType = 0L;
		if (billNo != null && billNo.length() == 13) {

			char c = billNo.charAt(1);
			// 先转换成String类型：
			String s = String.valueOf(c);
			// 再转换成Int类型：
			int i = Integer.parseInt(s);

			if (i == 1) {
				packType =270L;
			} else if (i == 2) {
				packType =271L;
			}else if(i == 3){
				packType =272L;
			}
		}
		return packType;
	};
@Override
public List<PackageForecast> queryLoadCarDetailParams(Map<String, Object> map) {
	List<PackageForecast> detailList = null;
	detailList = packageForecastDao.queryLoadCarDetailParams(map);
	return detailList;
}


}
