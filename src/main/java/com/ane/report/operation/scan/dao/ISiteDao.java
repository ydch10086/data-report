package com.ane.report.operation.scan.dao;

import java.util.List;

import com.ane.report.operation.scan.model.BasicEmployeeVO;
import com.ane.report.operation.scan.model.BasicSiteVO;
import com.ane.report.operation.scan.model.CustomerVO;



public interface ISiteDao {
	/**
	 * 根据拼音 编号 名称模糊查询
	 * @return List<BasicSite>
	 */
	List<BasicSiteVO> querySiteByLike(String param,int rownum/*,Long siteId*/);
	
	public List<BasicEmployeeVO> queryEmpByLike(String title,int rownum);
	
	public BasicEmployeeVO getSiteByEmployeeId(Long employeeId);
	
	List<CustomerVO> queryCustomer(String title,int rownum);
	
}
