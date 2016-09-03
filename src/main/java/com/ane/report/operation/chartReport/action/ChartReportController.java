package com.ane.report.operation.chartReport.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.operation.chartReport.model.ChartReportVO;
import com.ane.report.operation.chartReport.model.ReceiveAndSignChartVO;
import com.ane.report.operation.chartReport.service.IChartReportService;

@Controller
@RequestMapping("/chartReport")
public class ChartReportController {
	@Resource
	private IChartReportService chartReportService;
	/**
	 * 网点集包统计
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryChartReport")
	@ResponseBody
	public Map<String, String> groupPackCount(HttpServletRequest request){
		/*HttpSession session = request.getSession();
		AuthUser user =(AuthUser)session.getAttribute("user");
		long siteId =user.getSiteId();*/
		Map<String, String> map =chartReportService.groupPackCount();
		return map;
	} 
	/**
	 * 网点排名统计
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/querySiteRank")
	@ResponseBody
	public List<ChartReportVO> querySiteRank(HttpServletRequest request){
		return chartReportService.querySiteRank();
	} 
	/**
	 * 网点活动统计
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/siteActivityCount")
	@ResponseBody
	public List<ChartReportVO> siteActivityCount(HttpServletRequest request){
		return chartReportService.siteActivityCount();
	} 
	/**
	 * 收件签收统计
	 * @return
	 */
	@RequestMapping(value = "/arriveAndSignCount")
	@ResponseBody
	public List<ReceiveAndSignChartVO> arriveAndSignChart(){
		return chartReportService.arriveAndSignChart();
	}
	/**
	 * 签收图形统计
	 * @return
	 */
	@RequestMapping(value="/signCount")
	@ResponseBody
	public List<ReceiveAndSignChartVO> signChart(){
		return chartReportService.signChart();
	}
	/**
	 * 集包数量统计图形报表
	 * @return
	 */
	@RequestMapping(value="/groupPackCount")
	@ResponseBody
	public List<ChartReportVO> groupPackChart(){
		return chartReportService.groupPackChart();
	}
}
