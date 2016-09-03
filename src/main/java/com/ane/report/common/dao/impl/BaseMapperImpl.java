/**
 * @Title: BaseMapperImpl.java
 * @Package com.ane.dao.impl
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年4月12日 下午7:38:13
 * @version V1.0
 */

package com.ane.report.common.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.ane.report.common.dao.IBaseMapper;

/**
 * @ClassName: BaseMapperImpl
 * @Description: TODO
 * @author Comsys-xuanning
 * @date 2016年4月12日 下午7:38:13
 */
@SuppressWarnings("unchecked")
public abstract class BaseMapperImpl<T,ID extends Serializable> extends SqlSessionDaoSupport implements IBaseMapper<T, ID> {
	private SqlSessionFactory sqlSessionFactory;
	/**
	  * <p>Title: insert</p>
	  * <p>Description: </p>
	  * @param obj
	  * @return
	  * @see com.ane.dao.IBaseMapper#insert(java.lang.Object)
	  */
	@Override
	public boolean insert(T obj) {
		
		return ((IBaseMapper<T, ID>) this.getSqlSession().getMapper(getClass4NameSpace())).insert(obj);
	}

	/**
	  * <p>Title: batchSave</p>
	  * <p>Description: </p>
	  * @param objLst
	  * @return
	  * @see com.ane.dao.IBaseMapper#batchSave(java.util.List)
	  */
	@Override
	public int batchSave(List<T> objLst) {
		
		return ((IBaseMapper<T, ID>) this.getSqlSession().getMapper(getClass4NameSpace())).batchSave(objLst);
	}

	/**
	  * <p>Title: batchSave</p>
	  * <p>Description: </p>
	  * @param objLst
	  * @param foreignKey
	  * @return
	  * @see com.ane.dao.IBaseMapper#batchSave(java.util.List, java.lang.Object)
	  */
	@Override
	public int batchSave(List<? extends Serializable> objLst, Object foreignKey) {
		
		return ((IBaseMapper<T, ID>) this.getSqlSession().getMapper(getClass4NameSpace())).batchSave(objLst,foreignKey);
	}
	/**
	  * <p>Title: updateByPk</p>
	  * <p>Description: 根据主键更新</p>
	  * @param obj
	  * @return
	  * @see com.ane.dao.IBaseMapper#updateByPk(java.lang.Object)
	 */
	@Override
	public boolean updateByPk(T obj) {
		
		return ((IBaseMapper<T, ID>) this.getSqlSession().getMapper(getClass4NameSpace())).updateByPk(obj);
	}

	@Override
	public T getObjById(ID id) {
		
		return ((IBaseMapper<T, ID>) this.getSqlSession().getMapper(getClass4NameSpace())).getObjById(id);
	}

	@Override
	public T getObjByUniqueKey(String uniqueKey) {
		
		return ((IBaseMapper<T, ID>) this.getSqlSession().getMapper(getClass4NameSpace())).getObjByUniqueKey(uniqueKey);
	}

	/**
	  * <p>Title: checkDaoConfig</p>
	  * <p>Description: </p>
	  * @throws IllegalArgumentException
	  * @see org.springframework.dao.support.DaoSupport#checkDaoConfig()
	  */
	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		Assert.notNull(getSqlSession(),
				"Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required");
		Assert.notNull(getClass4NameSpace(),"实现类中需要要返回一个接口的对象");
	}
	@Autowired
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
		super.setSqlSessionFactory(this.sqlSessionFactory);
	}
}
