
 /**    
 * 文件名：ScanDataServiceImpl.java    
 *    
 * 版本信息：    
 * 日期：2016年6月15日 下午3:13:37
 *    
 */
package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.IScanDataDao;
import com.ane.report.operation.scan.model.ScanDataVO;
import com.ane.report.operation.scan.service.IScanDataService;
import com.github.pagehelper.PageHelper;


/**    
 *     
 * @ClassName: ScanDataServiceImpl 
 * @Description: 查询扫描记录 
 * @author 
 * @date 2016年6月15日 下午3:13:37      
 *     
 */
@Service("scanDataService")
public class ScanDataServiceImpl implements IScanDataService {

	@Resource
	private IScanDataDao scanDataDao;

	@Override
	public PagedResult<ScanDataVO> queryScanDataByPage(ScanDataVO scanDataVO,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);
		
		int scanType = scanDataVO.getScanType();
		if(scanType == 0){//全部
			return BeanUtil.toPagedResult(scanDataDao.queryScanDataAllByPage(scanDataVO));
		}else if(scanType == 1){//到包扫描
			return BeanUtil.toPagedResult(scanDataDao.queryArrivePackScanByPage(scanDataVO));
			
		}else if(scanType == 2){//卸车
			return BeanUtil.toPagedResult(scanDataDao.queryUnloadScanByPage(scanDataVO));
			
		}else if(scanType == 3){//装车
			return BeanUtil.toPagedResult(scanDataDao.queryLoadingScanByPage(scanDataVO));
			
		}else if(scanType == 4){//集包
			return BeanUtil.toPagedResult(scanDataDao.queryGroupPackScanByPage(scanDataVO));
			
		}else if(scanType == 5){//拆包
			return BeanUtil.toPagedResult(scanDataDao.querySplitPackScanByPage(scanDataVO));
			
		}else if(scanType == 6){//问题件
			return BeanUtil.toPagedResult(scanDataDao.queryProblemMainScanByPage(scanDataVO));
			
		}else if(scanType == 7){//留仓件
			return BeanUtil.toPagedResult(scanDataDao.queryStayScanByPage(scanDataVO));
			
		}else if(scanType == 8){//收件
			return BeanUtil.toPagedResult(scanDataDao.queryReceiveScanByPage(scanDataVO));
			
		}else if(scanType == 9){//发件
			return BeanUtil.toPagedResult(scanDataDao.querySendScanByPage(scanDataVO));
			
		}else if(scanType == 10){//称重
			return BeanUtil.toPagedResult(scanDataDao.queryWeighScanByPage(scanDataVO));
			
		}else if(scanType == 11){//到件
			return BeanUtil.toPagedResult(scanDataDao.queryArriveScanByPage(scanDataVO));
			
		}else if(scanType == 12){//派件
			return BeanUtil.toPagedResult(scanDataDao.queryDispatchScanByPage(scanDataVO));
			
		}else if(scanType == 13){//签收
			return BeanUtil.toPagedResult(scanDataDao.querySignScanByPage(scanDataVO));
			
		}
		return null;
	}
	
}
