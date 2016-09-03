package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.WeightScanVO;

public interface IWeighScanDao {

	List<WeightScanVO> queryWeighScanByPage(WeightScanVO weightScanVO);
}
