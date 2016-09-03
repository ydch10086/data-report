package com.ane.report.operation.groupWrong.dao;

import java.util.List;

import com.ane.report.operation.groupWrong.model.CenterGroupWrongVO;

public interface ICenterGroupWrongDao {
	List<CenterGroupWrongVO> queryEwbByPage(CenterGroupWrongVO entity);
	List<CenterGroupWrongVO> queryPackByPage(CenterGroupWrongVO entity);
	List<CenterGroupWrongVO> queryPackItemsByPage(CenterGroupWrongVO entity);
}
