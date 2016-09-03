package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.Receive;

public interface IReceiveScanDao {
	List<Receive> queryByPage(Receive entity);
}
