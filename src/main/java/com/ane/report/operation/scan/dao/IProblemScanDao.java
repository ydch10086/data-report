package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.ProblemScanVO;

public interface IProblemScanDao {
	List<ProblemScanVO> queryByPage(ProblemScanVO entity);

}
