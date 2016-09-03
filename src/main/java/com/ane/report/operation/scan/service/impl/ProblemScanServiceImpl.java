package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.IProblemScanDao;
import com.ane.report.operation.scan.model.ProblemScanVO;
import com.ane.report.operation.scan.service.IProblemScanService;
import com.github.pagehelper.PageHelper;
@Service("problemScanService")
public class ProblemScanServiceImpl implements IProblemScanService{
	@Resource
	private IProblemScanDao iProblemScanDao;
	@Override
	public PagedResult<ProblemScanVO> queryByPage(ProblemScanVO entity,
			Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(iProblemScanDao.queryByPage(entity));
	}

}
