package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.SendPackScanVO;

public interface ISendPackScanDao {
	/**
	 * 查询发包扫描
	 * @param sendPackScen
	 * @return
	 */
	List<SendPackScanVO> querySendPackScanByPage(SendPackScanVO sendPackScen);
}
