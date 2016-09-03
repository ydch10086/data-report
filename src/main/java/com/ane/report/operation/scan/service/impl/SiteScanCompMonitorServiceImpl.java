package com.ane.report.operation.scan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.common.util.BeanUtil;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.dao.ISiteScanCompMonitorDao;
import com.ane.report.operation.scan.model.SiteScanCompMonitorVO;
import com.ane.report.operation.scan.service.ISiteScanCompMonitorService;
import com.github.pagehelper.PageHelper;

/**
 * @author Administrator
 *
 */
@Service("siteScanCompMonitorService")
public class SiteScanCompMonitorServiceImpl implements ISiteScanCompMonitorService {

	@Resource
	private ISiteScanCompMonitorDao siteScanCompMonitorDao;
	@Override
	public PagedResult<SiteScanCompMonitorVO> querySiteScanCompMonitorByPage(
			SiteScanCompMonitorVO siteScanCompMonitorVO, Integer pageNo,
			Integer pageSize) {
		pageNo = pageNo == null?1:pageNo;
		pageSize = pageSize == null?10:pageSize;
		PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		//对比类型
		String compType = siteScanCompMonitorVO.getCompType();
		if("1".equals(compType)){
			//本站有收--本站未发
			return BeanUtil.toPagedResult(siteScanCompMonitorDao.querySiteScanCompMonitorYSWFByPage(siteScanCompMonitorVO));
		}else if("2".equals(compType)){
			//本站有发--本站未收
			return BeanUtil.toPagedResult(siteScanCompMonitorDao.querySiteScanCompMonitorYFWSByPage(siteScanCompMonitorVO));
		}else if("3".equals(compType)){
			//本站有到--本站未派
			return BeanUtil.toPagedResult(siteScanCompMonitorDao.querySiteScanCompMonitorYDWPByPage(siteScanCompMonitorVO));
		}else if("4".equals(compType)){
			//本站有派--本站未签
			return BeanUtil.toPagedResult(siteScanCompMonitorDao.querySiteScanCompMonitorYPWQByPage(siteScanCompMonitorVO));
		}else{
			//本站有签--本站未派
			return BeanUtil.toPagedResult(siteScanCompMonitorDao.querySiteScanCompMonitorYQWPByPage(siteScanCompMonitorVO));
		}
	}

}
