package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.IArriveDao;
import com.ane.report.operation.scan.model.Arrive;
import com.ane.report.operation.scan.service.IArriveService;
import com.github.pagehelper.PageHelper;

@Service("arriveService")
public class ArriveServiceImpl implements IArriveService{
	@Resource
	private IArriveDao iarriveDao;

	@Override
	public PagedResult<Arrive> queryByPage(Arrive arrive, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(iarriveDao.queryByPage(arrive));
	}



}
