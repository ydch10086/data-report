/**
 * @Title: IAuthUserMapper.java
 * @Package com.ane.report.common.model
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年6月3日 上午11:31:18
 * @version V1.0
 */

package com.ane.report.common.dao;

import org.apache.ibatis.annotations.Param;

import com.ane.report.common.model.AuthUser;

/**
 * @ClassName: IAuthUserMapper
 * @Description: TODO
 * @author Comsys-xuanning
 * @date 2016年6月3日 上午11:31:18
 */
public interface IAuthUserDao {

	AuthUser getUserByUserName(@Param("userName") String userName);
}
