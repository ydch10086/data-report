package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.GroupPackScanDetailVO;
import com.ane.report.operation.scan.model.GroupPackScanVO;

public interface IGroupPackScanService {

	/**
	 * 分页查询
	 * @param groupPackScanVO
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PagedResult<GroupPackScanVO> queryGroupPackScanByPage(GroupPackScanVO groupPackScanVO,Integer pageNo,Integer pageSize);
	
	/**
	 * 通过包条码查询详细信息
	 * @param groupPackScanDetailVO
	 * @return
	 */
	PagedResult<GroupPackScanDetailVO> queryGroupPackScanDetailBybpcode(GroupPackScanDetailVO groupPackScanDetailVO,Integer pageNo,Integer pageSize);
}
