package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.SiteScanCompMonitorVO;

public interface ISiteScanCompMonitorService {

	/**
	 * 分页查询
	 * @param SiteScanCompMonitorVO
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PagedResult<SiteScanCompMonitorVO> querySiteScanCompMonitorByPage(SiteScanCompMonitorVO siteScanCompMonitorVO,Integer pageNo,Integer pageSize);
}
