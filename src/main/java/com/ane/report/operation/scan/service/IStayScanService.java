package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.StayWarehouseVO;

public interface IStayScanService {
	PagedResult<StayWarehouseVO> queryByPage(StayWarehouseVO entity,Integer pageNo,Integer pageSize);

}
