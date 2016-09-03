package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.ISendScanDao;
import com.ane.report.operation.scan.model.SendScanVO;
import com.ane.report.operation.scan.service.ISendScanService;
import com.github.pagehelper.PageHelper;

@Service("sendScanService")
public class SendScanServiceImpl implements ISendScanService{
	@Resource
	private ISendScanDao sendScanDao;
	/**
	 * 分页查询发件扫描信息
	 */
	@Override
	public PagedResult<SendScanVO> querySendScanByPage(SendScanVO send,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);
		return BeanUtil.toPagedResult(sendScanDao.querySendScanByPage(send));
	}
}
