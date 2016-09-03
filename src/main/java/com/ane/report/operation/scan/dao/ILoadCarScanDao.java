package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.LoadCarScanDetailVO;
import com.ane.report.operation.scan.model.LoadCarScanVO;

public interface ILoadCarScanDao {

	List<LoadCarScanVO> queryLoadCarScanByPage(LoadCarScanVO loadCarScanVO);
	
	/**
	 * 通过任务号查询信息
	 * @param loadCarScanDetailVO
	 * @return
	 */
	List<LoadCarScanDetailVO> queryLoadCarScanByTastNum(LoadCarScanDetailVO loadCarScanDetailVO);
}
