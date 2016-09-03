package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.StayWarehouseVO;

public interface IStayScanDao {
	List<StayWarehouseVO> queryByPage(StayWarehouseVO entity);

}
