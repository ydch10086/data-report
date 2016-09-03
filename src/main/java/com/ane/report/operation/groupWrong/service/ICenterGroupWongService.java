package com.ane.report.operation.groupWrong.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.groupWrong.model.CenterGroupWrongVO;

public interface ICenterGroupWongService {
	//查询错录单
	PagedResult<CenterGroupWrongVO> queryEwbByPage(CenterGroupWrongVO entity,Integer pageNo,Integer pageSize);
	//查询错集包
	PagedResult<CenterGroupWrongVO> queryPackByPage(CenterGroupWrongVO entity,Integer pageNo,Integer pageSize);
	//查询明细
	PagedResult<CenterGroupWrongVO> queryPackItemsByPage(CenterGroupWrongVO entity,Integer pageNo,Integer pageSize);
}
