package com.ane.report.operation.groupWrong.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.groupWrong.dao.ICenterGroupWrongDao;
import com.ane.report.operation.groupWrong.model.CenterGroupWrongVO;
import com.ane.report.operation.groupWrong.service.ICenterGroupWongService;
import com.github.pagehelper.PageHelper;
@Service("centerGroupWrongService")
public class CenterGroupWrongServiceImpl implements ICenterGroupWongService{
	@Resource
	private ICenterGroupWrongDao iCenterGroupWrongDao;
	@Override
	public PagedResult<CenterGroupWrongVO> queryEwbByPage(
			CenterGroupWrongVO entity, Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize); 
		return BeanUtil.toPagedResult(iCenterGroupWrongDao.queryEwbByPage(entity));
	}
	@Override
	public PagedResult<CenterGroupWrongVO> queryPackByPage(
			CenterGroupWrongVO entity, Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize); 
		return BeanUtil.toPagedResult(iCenterGroupWrongDao.queryPackByPage(entity));
	}
	@Override
	public PagedResult<CenterGroupWrongVO> queryPackItemsByPage(
			CenterGroupWrongVO entity, Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize); 
		return BeanUtil.toPagedResult(iCenterGroupWrongDao.queryPackItemsByPage(entity));
	}

}
