package com.ane.report.operation.scan.dao;

import java.util.List;
import com.ane.report.operation.scan.model.DispatchScanVO;

public interface IDispatchScanDao {
	/**
	 * 查询派件信息
	 * @param dispatch
	 * @return
	 */
	List<DispatchScanVO> queryDispatchScanByPage(DispatchScanVO dispatch);
}
