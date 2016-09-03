package com.ane.report.operation.scan.dao;

import java.util.List;
import com.ane.report.operation.scan.model.SendScanVO;


public interface ISendScanDao {
	
	/**
	 * 查询发件扫描信息
	 * @param send
	 * @return
	 */
	List<SendScanVO> querySendScanByPage(SendScanVO send);

}
