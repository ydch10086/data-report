package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.SignScanVO;

public interface ISignScanService {
	
	PagedResult<SignScanVO> querySignScanByPage(SignScanVO signScan,Integer pageNo,Integer pageSize);
	
}
