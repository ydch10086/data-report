package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.Arrive;

public interface IArriveService {
	/**
	 * 分页查询
	 * @param weightScanVO
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PagedResult<Arrive> queryByPage(Arrive arrive,Integer pageNo,Integer pageSize);
}
