package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.LoadCarScanDetailVO;
import com.ane.report.operation.scan.model.LoadCarScanVO;

public interface ILoadCarScanService {

	/**
	 * 分页查询
	 * @param loadCarScanVO
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PagedResult<LoadCarScanVO> queryLoadCarScanByPage(LoadCarScanVO loadCarScanVO,Integer pageNo,Integer pageSize);
	
	/**
	 * 通过任务号查询信息
	 * @param loadCarScanDetailVO
	 * @return
	 */
	PagedResult<LoadCarScanDetailVO> queryLoadCarScanByTastNum(LoadCarScanDetailVO loadCarScanDetailVO,Integer pageNo,Integer pageSize);
}
