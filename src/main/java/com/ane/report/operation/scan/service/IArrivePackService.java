package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.ArrivePack;

public interface IArrivePackService {
	PagedResult<ArrivePack> queryByPage(ArrivePack entity,Integer pageNo,Integer pageSize);

}
