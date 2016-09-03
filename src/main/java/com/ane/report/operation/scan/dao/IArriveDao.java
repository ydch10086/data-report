package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.Arrive;



public interface IArriveDao{
	List<Arrive> queryByPage(Arrive entity);
}
