package com.ane.report.operation.scan.service;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.ProblemScanVO;

public interface IProblemScanService {
	PagedResult<ProblemScanVO> queryByPage(ProblemScanVO entity,Integer pageNo,Integer pageSize);
}
