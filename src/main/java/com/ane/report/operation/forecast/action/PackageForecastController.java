package com.ane.report.operation.forecast.action;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.forecast.model.PackageForecast;
import com.ane.report.operation.forecast.service.IPackageForecastService;
import com.ane.report.operation.scan.action.BaseController;

@Controller
@RequestMapping("/forecast")
public class PackageForecastController extends BaseController{
	@Resource
	private IPackageForecastService packageForecastService;
	
	
	
	@RequestMapping(value = "/forecastData")
	public ModelAndView forecastDataPage(PackageForecast eneity,Integer pageNum,Integer pageSize) {
		ModelAndView mv = new ModelAndView("opreation/forecast/forecastData");//默认为forward模式  
		return mv; 
	}
	
	/**
	 * 货量预报查询
	 * @param eneity
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/queryForecastDataByParams", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView queryForecastDataByParams(PackageForecast eneity,Integer pageNum,
			Integer pageSize){
		ModelAndView mv = new ModelAndView("opreation/forecast/forecastDataList");//默认为forward模式  
		PagedResult<PackageForecast> pageResult  = packageForecastService.queryDataByPage(eneity, pageNum, pageSize);
		mv.addObject("pageResult", pageResult);
		return mv;
	}
	/**
	 * 货量预报详情
	 * @param eneity
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/queryLoadCarDetailParams", method = RequestMethod.POST)
	public ModelAndView  queryLoadCarDetailParams(PackageForecast eneity,Integer pageNum,Integer pageSize,Model model){
		Map<String,Object> detailMap = new HashMap<String,Object>();
		ModelAndView mv = new ModelAndView("opreation/forecast/forecastDetail");//默认为forward模式  
		String carNum = eneity.getCarNum();
		String taskNum = eneity.getTaskNum();
		String leaveSite = eneity.getLeaveSite();
		String nextSite = eneity.getNextSite();
		detailMap.put("carNum", carNum);
		detailMap.put("taskNum", taskNum);
		detailMap.put("leaveSite", leaveSite);
		detailMap.put("nextSite", nextSite);
		List<PackageForecast> pageResult = packageForecastService.queryLoadCarDetailParams(detailMap);
		mv.addObject("data", pageResult);
		return mv;  
	}
	
	/**
	 * 货量预报详情
	 * @param eneity
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/queryLoadCarDetailDataParams", method = RequestMethod.POST)
	public List<PackageForecast>  queryLoadCarDetailDataParams(PackageForecast eneity){
		Map<String,Object> detailMap = new HashMap<String,Object>();
		String carNum = eneity.getCarNum();
		String taskNum = eneity.getTaskNum();
		String leaveSite = eneity.getLeaveSite();
		String nextSite = eneity.getNextSite();
		detailMap.put("carNum", carNum);
		detailMap.put("taskNum", taskNum);
		detailMap.put("leaveSite", leaveSite);
		detailMap.put("nextSite", nextSite);
		List<PackageForecast> pageResult = packageForecastService.queryLoadCarDetailParams(detailMap);
		return pageResult;  
	}
}
