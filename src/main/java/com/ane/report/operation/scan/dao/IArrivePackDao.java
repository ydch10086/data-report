package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.ArrivePack;

public interface IArrivePackDao {
	List<ArrivePack> queryByPage(ArrivePack entity);

}
