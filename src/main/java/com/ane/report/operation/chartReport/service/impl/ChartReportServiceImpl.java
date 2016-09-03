package com.ane.report.operation.chartReport.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ane.report.operation.chartReport.dao.IChartReportDao;
import com.ane.report.operation.chartReport.model.ChartReportVO;
import com.ane.report.operation.chartReport.model.ReceiveAndSignChartVO;
import com.ane.report.operation.chartReport.service.IChartReportService;

@Service("chartReportService")
public class ChartReportServiceImpl implements IChartReportService{
	@Resource
	private IChartReportDao iChartReportDao;
	@Override
	public Map<String, String> groupPackCount() {
		return iChartReportDao.groupPackCount();
	}
	@Override
	public List<ChartReportVO> querySiteRank() {
		return iChartReportDao.querySiteRank();
	}
	@Override
	public List<ChartReportVO> siteActivityCount() {
		return iChartReportDao.siteActivityCount();
	}
	/**
	 * 收件统计报表
	 */
	@Override
	public List<ReceiveAndSignChartVO> arriveAndSignChart(){
		return iChartReportDao.arriveAndSignChart();
	}
	/**
	 * 签收统计报表
	 */
	@Override
	public List<ReceiveAndSignChartVO> signChart() {
		return iChartReportDao.signChart();
	}
	@Override
	public List<ChartReportVO> groupPackChart() {
		return iChartReportDao.groupPackChart();
	}
}
