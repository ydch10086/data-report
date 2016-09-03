package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.IDispatchScanDao;
import com.ane.report.operation.scan.model.DispatchScanVO;
import com.ane.report.operation.scan.service.IDispatchScanService;
import com.github.pagehelper.PageHelper;

@Service("dispatchScanService")
public class DispatchScanServiceImpl implements IDispatchScanService{
	@Resource
	private IDispatchScanDao dispatchDao;
	/**
	 * 分页查询派件扫描信息
	 */
	@Override
	public PagedResult<DispatchScanVO> queryDispatchScanByPage(DispatchScanVO dispatch,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);
		return BeanUtil.toPagedResult(dispatchDao.queryDispatchScanByPage(dispatch));
	}
}
