package com.ane.report.operation.scan.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ane.report.common.dao.impl.BaseMapperImpl;
import com.ane.report.operation.scan.dao.ISiteDao;
import com.ane.report.operation.scan.model.BasicEmployeeVO;
import com.ane.report.operation.scan.model.BasicSiteVO;
import com.ane.report.operation.scan.model.CustomerVO;

@Repository("siteDao")
public class SiteDaoImpl extends BaseMapperImpl<BasicSiteVO, Long> implements ISiteDao{
	private final Class<ISiteDao> site = ISiteDao.class;
	
	/**
	 * 根据拼音 编号 名称模糊查询网点
	 * @return List<BasicSite>
	 */
//	@Override
//	public List<BasicSiteVO> querySiteByLike(String param){
//		return getSqlSession().getMapper(site).querySiteByLike(param);
//	}
	/**
	 * 根据拼音 编号 人名 模糊查员工
	 */
//	@Override
//	public List<BasicEmployeeVO> queryEmpByLike(String title){
//		return getSqlSession().getMapper(site).queryEmpByLike(title);
//	}
	/**
	 * 根据拼音 编号 名称模糊查询
	 * @return List<BasicSite>
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<BasicSiteVO> querySiteByLike(String siteName,int rownum/*,Long siteId*/)  {
		List<BasicSiteVO> list=null;	
		Map map=new HashMap();
		map.put("rownum", rownum);
		map.put("siteName", siteName);
		map.put("sitePinyin", siteName.toUpperCase());
		/*map.put("loginSite", siteId);*/
		List obj=getSqlSession().selectList("BasicSiteMapper.querySiteByLike",map);
		if(obj!=null&&obj.size()>0){
			list=(List<BasicSiteVO>)obj;
		}
		return list;
	}

	@Override
	public Class<?> getClass4NameSpace() {
		return site;
	}
	
	/**
	 * 根据名称、拼音、编号模糊查询员工
	 * @param title
	 * @return List
	 * @throws DaoException 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<BasicEmployeeVO> queryEmpByLike(String title,int rownum){
		List<BasicEmployeeVO> list=null;	
		Map map=new HashMap();
		map.put("rownum", rownum);
		map.put("title", title);
		map.put("pinyin", title.toUpperCase());
//		map.put("siteId", siteId);
		List obj=getSqlSession().selectList("EmployeeVOMapper.queryEmpByLikePCN", map);
		if(obj!=null&&obj.size()>0){
			list=(List<BasicEmployeeVO>)obj;
		}
		return list;
	}
	/**
	 * 根据员工id查询网点
	 */
	@Override
	public BasicEmployeeVO getSiteByEmployeeId(Long employeeId) {
		return getSqlSession().selectOne("EmployeeVOMapper.getSiteByEmployeeId", employeeId);
	}
	/**
	 * 根据名称、拼音、编号模糊查询客户
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<CustomerVO> queryCustomer(String title, int rownum) {
		List<CustomerVO> list=null;	
		Map map=new HashMap();
		map.put("rownum", rownum);
		map.put("title", title);
		map.put("pinyin", title.toUpperCase());
		List obj=getSqlSession().selectList("CustomerVOMapper.queryCustomerByPCN", map);
		if(obj!=null&&obj.size()>0){
			list=(List<CustomerVO>)obj;
		}
		return list;
	}
}
