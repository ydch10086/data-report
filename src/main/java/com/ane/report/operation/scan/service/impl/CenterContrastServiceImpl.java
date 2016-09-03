package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.ICenterContrastDao;
import com.ane.report.operation.scan.model.CenterContrastVO;
import com.ane.report.operation.scan.service.ICenterContrastService;
import com.github.pagehelper.PageHelper;

@Service("centerContrastService")
public class CenterContrastServiceImpl implements ICenterContrastService {
	@Resource
	private  ICenterContrastDao iCenterContrastDao;
	@Override
	public PagedResult<CenterContrastVO> queryLoadcar(CenterContrastVO entity,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);
		return BeanUtil.toPagedResult(iCenterContrastDao.queryLoadcar(entity));
	}

	@Override
	public PagedResult<CenterContrastVO> queryUnloadcar(
			CenterContrastVO entity, Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);
		return BeanUtil.toPagedResult(iCenterContrastDao.queryUnloadcar(entity));
	}

}
