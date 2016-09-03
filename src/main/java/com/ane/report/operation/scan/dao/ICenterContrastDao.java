package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.CenterContrastVO;

public interface ICenterContrastDao {
	List<CenterContrastVO> queryLoadcar(CenterContrastVO entity);
	List<CenterContrastVO> queryUnloadcar(CenterContrastVO entity);

}
