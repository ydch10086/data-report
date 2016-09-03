package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.GroupPackScanDetailVO;
import com.ane.report.operation.scan.model.GroupPackScanVO;

public interface IGroupPackScanDao {

	List<GroupPackScanVO> queryGroupPackScanByPage(GroupPackScanVO groupPackScanVO);
	/**
	 * 通过包条码查询详细信息
	 * @param groupPackScanDetailVO
	 * @return
	 */
	List<GroupPackScanDetailVO> queryGroupPackScanDetailBybpcode(GroupPackScanDetailVO groupPackScanDetailVO);
}
