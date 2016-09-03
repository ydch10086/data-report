package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.IGroupPackScanDao;
import com.ane.report.operation.scan.model.GroupPackScanDetailVO;
import com.ane.report.operation.scan.model.GroupPackScanVO;
import com.ane.report.operation.scan.service.IGroupPackScanService;
import com.github.pagehelper.PageHelper;

/**
 * @author Administrator
 *
 */
@Service("groupPackScanService")
public class GroupPackScanServiceImpl implements IGroupPackScanService {

	@Resource
	private IGroupPackScanDao groupPackScanDao;
	@Override
	public PagedResult<GroupPackScanVO> queryGroupPackScanByPage(GroupPackScanVO groupPackScanVO,Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(groupPackScanDao.queryGroupPackScanByPage(groupPackScanVO));
	}
	@Override
	public PagedResult<GroupPackScanDetailVO> queryGroupPackScanDetailBybpcode(
			GroupPackScanDetailVO groupPackScanDetailVO,Integer pageNo,Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(groupPackScanDao.queryGroupPackScanDetailBybpcode(groupPackScanDetailVO));
	}

}
