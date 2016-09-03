package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.ScanDataVO;
/**
 * @ClassName: IScanDataDao 
 * @Description: 扫描记录查询DAO
 * @author 
 * @date 2016年6月15日 下午2:55:16      
 *
 */
public interface IScanDataService {
	/**
	 * 
	 * @Title: queryScanDataAllByPage 
	 * @Description: 查询全部 
	 * @param scanDataVO
	 * @return
	 * PagedResult<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:11:46
	 */
	PagedResult<ScanDataVO> queryScanDataByPage(ScanDataVO scanDataVO,Integer pageNo, Integer pageSize);
	
	
}
