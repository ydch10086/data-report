package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.ISendPackScanDao;
import com.ane.report.operation.scan.model.SendPackScanVO;
import com.ane.report.operation.scan.service.ISendPackScanService;
import com.github.pagehelper.PageHelper;

@Service("sendPackScanService")
public class SendPackScanServiceImpl implements ISendPackScanService{
	@Resource
	private ISendPackScanDao sendPackScanDao;
	/**
	 * 分页查询发包扫描信息
	 */
	@Override
	public PagedResult<SendPackScanVO> querySendPackByPage(SendPackScanVO sendPackScan, Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);
		return BeanUtil.toPagedResult(sendPackScanDao.querySendPackScanByPage(sendPackScan));
	}
}
