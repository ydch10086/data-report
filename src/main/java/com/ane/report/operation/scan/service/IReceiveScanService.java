package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.Receive;

public interface IReceiveScanService {
	PagedResult<Receive> queryByPage(Receive entity,Integer pageNo,Integer pageSize);
}
