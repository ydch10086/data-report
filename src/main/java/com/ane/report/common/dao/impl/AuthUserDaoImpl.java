/**
 * @Title: AuthUserDaoImpl.java
 * @Package com.ane.report.common.dao.impl
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年6月3日 上午11:56:30
 * @version V1.0
 */

package com.ane.report.common.dao.impl;

import org.springframework.stereotype.Repository;

import com.ane.report.common.dao.IAuthUserDao;
import com.ane.report.common.model.AuthUser;

/**
 * @ClassName: AuthUserDaoImpl
 * @Description: TODO
 * @author Comsys-xuanning
 * @date 2016年6月3日 上午11:56:30
 */
@Repository("authUserRepo")
public class AuthUserDaoImpl extends BaseMapperImpl<AuthUser, Long> implements IAuthUserDao {

	private final Class<IAuthUserDao> authUser = IAuthUserDao.class;
	
	/**
	 * <p>Title: getUserByUserName</p>
	 * <p>Description: </p>
	 * @param userName
	 * @return
	 * @see com.ane.report.common.dao.IAuthUserDao#getUserByUserName(java.lang.String)
	 */
	@Override
	public AuthUser getUserByUserName(String userName) {

		return getSqlSession().getMapper(authUser).getUserByUserName(userName);
	}

	/**
	  * <p>Title: getClass4NameSpace</p>
	  * <p>Description: </p>
	  * @return
	  * @see com.ane.report.common.dao.IBaseMapper#getClass4NameSpace()
	  */
	@Override
	public Class<?> getClass4NameSpace() {
		
		return authUser;
	}

}
