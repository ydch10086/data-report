package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.ScanDataVO;
/**
 * @ClassName: IScanDataDao 
 * @Description: 扫描记录查询DAO
 * @author 
 * @date 2016年6月15日 下午2:55:16      
 *
 */
public interface IScanDataDao {
	/**
	 * 
	 * @Title: queryScanDataAllByPage 
	 * @Description: 查询全部 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:11:46
	 */
	List<ScanDataVO> queryScanDataAllByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryWeighScanByPage 
	 * @Description: 称重扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午2:58:36
	 */
	List<ScanDataVO> queryWeighScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryArriveScanByPage 
	 * @Description: 到件扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午2:58:36
	 */
	List<ScanDataVO> queryArriveScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryArrivePackScanByPage 
	 * @Description: 到包扫描
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午2:58:36
	 */
	List<ScanDataVO> queryArrivePackScanByPage(ScanDataVO scanDataVO);
	/**
	 * @Title: queryUnloadScanByPage 
	 * @Description: 卸车扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:01:57
	 */
	List<ScanDataVO> queryUnloadScanByPage(ScanDataVO scanDataVO);
	
	/**
	 * 
	 * @Title: queryLoadingScanByPage 
	 * @Description: 装车扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:02:35
	 */
	List<ScanDataVO> queryLoadingScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryGroupPackScanByPage 
	 * @Description: 集包扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:03:15
	 */
	List<ScanDataVO> queryGroupPackScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: querySplitPackScanByPage 
	 * @Description: 拆包扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:04:12
	 */
	List<ScanDataVO> querySplitPackScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryProblemMainScanByPage 
	 * @Description: 问题件扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:05:00
	 */
	List<ScanDataVO> queryProblemMainScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryStayScanByPage 
	 * @Description: 留仓件扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:06:08
	 */
	List<ScanDataVO> queryStayScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryReceiveScanByPage 
	 * @Description: 收件扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:07:52
	 */
	List<ScanDataVO> queryReceiveScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: querySendScanByPage 
	 * @Description: 发件扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:08:33
	 */
	List<ScanDataVO> querySendScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: queryDispatchScanByPage 
	 * @Description: 派件扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:10:00
	 */
	List<ScanDataVO> queryDispatchScanByPage(ScanDataVO scanDataVO);
	/**
	 * 
	 * @Title: querySignScanByPage 
	 * @Description: 签收扫描 
	 * @param scanDataVO
	 * @return
	 * List<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:10:38
	 */
	List<ScanDataVO> querySignScanByPage(ScanDataVO scanDataVO);
	
}
