package com.ane.report.operation.forecast.service;

import java.util.List;
import java.util.Map;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.forecast.model.BasicPackage;
import com.ane.report.operation.forecast.model.PackageForecast;
public interface IPackageForecastService {
	/**
	 * 分页查询中心货量信息
	 * @param eneity
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PagedResult<PackageForecast> queryDataByPage(PackageForecast eneity,Integer pageNo,Integer pageSize);
	/**
	 * 获取包信息
	 * @param map
	 * @return
	 */
	List<BasicPackage> queryPackageDataParams(Map<String,Object> map);
	/**
	 * 获取货量详情
	 * @param map
	 * @return
	 */
	List<PackageForecast> queryLoadCarDetailParams(Map<String,Object> map);
}
