package com.ane.report.common.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ane.report.operation.scan.dao.ISiteDao;
import com.ane.report.operation.scan.model.BasicEmployeeVO;
import com.ane.report.operation.scan.model.BasicSiteVO;
import com.ane.report.operation.scan.model.CustomerVO;


@Service("commonService")
public class CommonService{
	@Autowired
	private ISiteDao siteDao;
	/**
	 * 按拼音 名称 编号 查询网点
	 * 
	 * @param parentSiteId
	 * @return List<BasicSite>
	 */
	public List<BasicSiteVO> querySiteByLike(String pNameCode,int rownum/*,Long siteId*/){
		return siteDao.querySiteByLike(pNameCode, rownum/*,siteId*/);
	}
	
	/**
	 * 根据拼音 编号 人名 模糊查员工
	 * 
	 * @param pcnString
	 * @return List<BasicCounty>
	 */
	public List<BasicEmployeeVO> queryEmpByPNC(String pcnString,int rownum){
		 List<BasicEmployeeVO> list=siteDao.queryEmpByLike(pcnString,rownum);
		 if(list==null){
			 return null;
		 }
		 return list;
	}
	/**
	 * 根据员工编号查询网点
	 * @param employeeId
	 * @return
	 */
	public BasicEmployeeVO getSiteByEmployeeId(Long employeeId){
		BasicEmployeeVO employee=null;
		Object obj=siteDao.getSiteByEmployeeId(employeeId);
		if(obj!=null){
			employee=(BasicEmployeeVO) obj;
		}
		return employee;
	}
	/**
	 * 根据拼音 编号 人名 模糊查客户
	 * @param pcnString
	 * @param rownum
	 * @return
	 */
	public List<CustomerVO> queryCustomer(String pcnString,int rownum){
		List<CustomerVO> lists=siteDao.queryCustomer(pcnString, rownum);
		if(lists == null){
			return null;
		}
		return lists;
	}
}
