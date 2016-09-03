package com.ane.report.operation.scan.dao.impl;

import java.util.List;

import com.ane.report.common.dao.impl.BaseMapperImpl;
import com.ane.report.operation.scan.dao.ISendScanDao;
import com.ane.report.operation.scan.model.SendScanVO;

public class SendScanDaoImpl extends BaseMapperImpl<SendScanVO, Long> implements ISendScanDao{
	private final Class<ISendScanDao> sendScan = ISendScanDao.class;
	/**
	 * 查询发件扫描信息
	 */
	@Override
	public List<SendScanVO> querySendScanByPage(SendScanVO send) {
		return getSqlSession().getMapper(sendScan).querySendScanByPage(send);
	}
	
	@Override
	public Class<?> getClass4NameSpace() {
		
		return sendScan;
	}

}
