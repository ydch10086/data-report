package com.ane.report.operation.scan.dao;

import java.util.List;
import com.ane.report.operation.scan.model.SignScanVO;

public interface ISignScanDao {
	/**
	 * 查询签收扫描信息
	 * @param signScan
	 * @return
	 */
	List<SignScanVO> querySignScanByPage(SignScanVO signScan);
}
