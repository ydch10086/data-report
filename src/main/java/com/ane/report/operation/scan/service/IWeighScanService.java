package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.WeightScanVO;

public interface IWeighScanService {

	/**
	 * 分页查询
	 * @param weightScanVO
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PagedResult<WeightScanVO> queryWeighScanByPage(WeightScanVO weightScanVO,Integer pageNo,Integer pageSize);
}
