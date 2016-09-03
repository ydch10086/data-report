package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.SendScanVO;

public interface ISendScanService {
	/**
	 * 分页查询发件扫描信息
	 * @param send
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PagedResult<SendScanVO> querySendScanByPage(SendScanVO send,Integer pageNo,Integer pageSize);
}
