/**
 * @Title: IBaseMapper.java
 * @Package com.ane.dao
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年4月12日 下午7:32:38
 * @version V1.0
 */

package com.ane.report.common.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: IBaseMapper
 * @Description: TODO
 * @author Comsys-xuanning
 * @date 2016年4月12日 下午7:32:38
 */
public interface IBaseMapper<T,ID extends Serializable> {
	/**
	  * getClass4NameSpace
	  *
	  * @Title: getClass4NameSpace
	  * @Description: 得到mybatis的nameSpace;mybatis的nameSpace为其接口的简单名称
	  * @author Comsys-xuanning
	  * @param interClazz
	  * @return    设定文件
	  * @throws
	 */
	Class<?> getClass4NameSpace();
	
	/**
	  * insert
	  * @Title: insert
	  * @Description: 新增一个实体
	  * @author Comsys-xuanning
	  * @param obj
	  * @return    设定文件
	  * @throws
	 */
	boolean insert(T obj);
	/**
	  * batchSave
	  * @Title: batchSave
	  * @Description: 批量保存一个实体集合
	  * @author Comsys-xuanning
	  * @param objLst
	  * @return    设定文件
	  * @throws
	 */
	int batchSave(@Param("objLst") List<T> objLst);
	/**
	  * bathchSave
	  *
	  * @Title: batchSave
	  * @Description: 批量保存一个实体集合,并且对集合中的所有数据设置相同的外键
	  * @author Comsys-xuanning
	  * @param objLst
	  * @param foreignKey
	  * @return    设定文件
	  * @throws
	 */
	int batchSave(@Param("objLst") List<? extends Serializable> objLst,@Param("foreignKey") Object foreignKey);
	/**
	  * updateByPk
	  *
	  * @Title: updateByPk
	  * @Description: 根据主键来更新实体
	  * @author Comsys-xuanning
	  * @param obj
	  * @return    设定文件
	  * @throws
	 */
	boolean updateByPk(@Param("obj") T obj);
	/**
	  * getObjById
	  *
	  * @Title: getObjById
	  * @Description: 根据主键来获取到对象
	  * @author Comsys-xuanning
	  * @param id
	  * @return    设定文件
	  * @throws
	 */
	T getObjById(ID id);
	/**
	  * getObjByUniqueKey
	  *
	  * @Title: getObjByUniqueKey
	  * @Description: 根据唯一键来获取对象
	  * @author Comsys-xuanning
	  * @param uniqueKey
	  * @return    设定文件
	  * @throws
	 */
	T getObjByUniqueKey(@Param("uniqueKey")String uniqueKey);
}
