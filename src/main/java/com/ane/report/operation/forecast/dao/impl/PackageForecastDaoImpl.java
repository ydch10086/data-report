package com.ane.report.operation.forecast.dao.impl;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.ane.report.common.dao.impl.BaseMapperImpl;
import com.ane.report.operation.forecast.dao.IPackageForecastDao;
import com.ane.report.operation.forecast.model.BasicPackage;
import com.ane.report.operation.forecast.model.PackageForecast;

@Repository("packageForecastDao")
public class PackageForecastDaoImpl extends BaseMapperImpl<PackageForecast, Long> implements IPackageForecastDao{
	private final Class<IPackageForecastDao> forecast = IPackageForecastDao.class;
	
	@Override
	public Class<?> getClass4NameSpace() {
		
		return forecast;
	}

	@Override
	public List<PackageForecast> queryDataByPage(PackageForecast entity) {
		List<PackageForecast> foreCastList=null;
		foreCastList = getSqlSession().getMapper(forecast).queryDataByPage(entity);
		return foreCastList;
	}
	@Override
	public List<PackageForecast> queryDataByParams(PackageForecast eneity) {
		List<PackageForecast> foreCastList=null;
		foreCastList = getSqlSession().getMapper(forecast).queryDataByParams(eneity);
		return foreCastList;
	}

	@Override
	public List<PackageForecast> queryDataByMapParams(Map<String, Object> map) {
		List<PackageForecast> foreCastList=null;
		foreCastList = getSqlSession().getMapper(forecast).queryDataByMapParams(map);
		return foreCastList;
	}

	@Override
	public List<BasicPackage> queryPackageDataParams(Map<String, Object> map) {
		List<BasicPackage> packageList=null;
		packageList = getSqlSession().getMapper(forecast).queryPackageDataParams(map);
		return packageList;
	}

	@Override
	public List<PackageForecast> queryLoadCarDetailParams(
			Map<String, Object> map) {
		List<PackageForecast> detailList=null;
		detailList = getSqlSession().getMapper(forecast).queryLoadCarDetailParams(map);
		return detailList;
	}

	@Override
	public Integer queryCarDepartCountByParams(Map<String, Object> map) {
		Integer result = 0;
		result = getSqlSession().getMapper(forecast).queryCarDepartCountByParams(map);
		return result;
	}

	@Override
	public Integer queryUnloadCarCountByParams(Map<String, Object> map) {
		Integer result = 0;
		result = getSqlSession().getMapper(forecast).queryUnloadCarCountByParams(map);
		return result;
	}
}
