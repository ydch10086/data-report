package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.IStayScanDao;
import com.ane.report.operation.scan.model.StayWarehouseVO;
import com.ane.report.operation.scan.service.IStayScanService;
import com.github.pagehelper.PageHelper;
@Service("stayScanService")
public class StayScanServiceImpl implements IStayScanService{
	@Resource
	private IStayScanDao iStayScanDao;

	@Override
	public PagedResult<StayWarehouseVO> queryByPage(
			StayWarehouseVO entity, Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(iStayScanDao.queryByPage(entity));
	}
	
}
