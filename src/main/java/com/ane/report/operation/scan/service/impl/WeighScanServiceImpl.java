package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.IWeighScanDao;
import com.ane.report.operation.scan.model.WeightScanVO;
import com.ane.report.operation.scan.service.IWeighScanService;
import com.github.pagehelper.PageHelper;

/**
 * @author Administrator
 *
 */
@Service("weighScanService")
public class WeighScanServiceImpl implements IWeighScanService {

	@Resource
	private IWeighScanDao weihtScanDao;
	/* (non-Javadoc)
	 * @see com.ane.report.operation.scan.service.WeighScanService#queryByPage(com.ane.report.operation.scan.model.WeightScanVO, java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public PagedResult<WeightScanVO> queryWeighScanByPage(WeightScanVO weightScanVO,Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		return BeanUtil.toPagedResult(weihtScanDao.queryWeighScanByPage(weightScanVO));
	}

}
