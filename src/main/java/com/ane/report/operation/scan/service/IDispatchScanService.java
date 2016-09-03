package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.DispatchScanVO;

public interface IDispatchScanService {
	
	PagedResult<DispatchScanVO> queryDispatchScanByPage(DispatchScanVO dispatch,Integer pageNo,Integer pageSize);
	
}
