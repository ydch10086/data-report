package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.SendPackScanVO;

public interface ISendPackScanService {
	
	PagedResult<SendPackScanVO> querySendPackByPage(SendPackScanVO sendPackScan,Integer pageNo,Integer pageSize);
	
}
