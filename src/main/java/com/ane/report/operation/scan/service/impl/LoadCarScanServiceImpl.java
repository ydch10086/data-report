package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.ILoadCarScanDao;
import com.ane.report.operation.scan.model.LoadCarScanDetailVO;
import com.ane.report.operation.scan.model.LoadCarScanVO;
import com.ane.report.operation.scan.service.ILoadCarScanService;
import com.github.pagehelper.PageHelper;

/**
 * @author Administrator
 *
 */
@Service("loadCarScanService")
public class LoadCarScanServiceImpl implements ILoadCarScanService {

	@Resource
	private ILoadCarScanDao loadCarScanDao;
	@Override
	public PagedResult<LoadCarScanVO> queryLoadCarScanByPage(LoadCarScanVO loadCarScanVO,Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(loadCarScanDao.queryLoadCarScanByPage(loadCarScanVO));
	}
	@Override
	public PagedResult<LoadCarScanDetailVO> queryLoadCarScanByTastNum(
			LoadCarScanDetailVO loadCarScanDetailVO, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(loadCarScanDao.queryLoadCarScanByTastNum(loadCarScanDetailVO));
	}

}
