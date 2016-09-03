package com.ane.report.operation.forecast.dao;


import java.util.List;
import java.util.Map;

import com.ane.report.operation.forecast.model.BasicPackage;
import com.ane.report.operation.forecast.model.PackageForecast;



public interface IPackageForecastDao{
	
	
	List<PackageForecast> queryDataByPage(PackageForecast entity);
	
	List<PackageForecast> queryDataByParams(PackageForecast eneity);
	
	List<PackageForecast> queryDataByMapParams(Map<String,Object> map);
	
	List<BasicPackage> queryPackageDataParams(Map<String,Object> map);
	
	List<PackageForecast> queryLoadCarDetailParams(Map<String,Object> map);
	
	Integer queryCarDepartCountByParams(Map<String,Object> map);

	Integer queryUnloadCarCountByParams(Map<String,Object> map);
}
