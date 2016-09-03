package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.CenterContrastVO;

public interface ICenterContrastService {
	PagedResult<CenterContrastVO> queryLoadcar(CenterContrastVO entity,Integer pageNo,Integer pageSize);
	PagedResult<CenterContrastVO> queryUnloadcar(CenterContrastVO entity,Integer pageNo,Integer pageSize);
}
