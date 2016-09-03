package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.ISignScanDao;
import com.ane.report.operation.scan.model.SignScanVO;
import com.ane.report.operation.scan.service.ISignScanService;
import com.github.pagehelper.PageHelper;

@Service("signScanService")
public class SignScanServiceImpl implements ISignScanService{
	@Resource
	private ISignScanDao signDao;
	/**
	 * 分页查询签收扫描信息
	 */
	@Override
	public PagedResult<SignScanVO> querySignScanByPage(SignScanVO signScan,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);
		return BeanUtil.toPagedResult(signDao.querySignScanByPage(signScan));
	}
}
