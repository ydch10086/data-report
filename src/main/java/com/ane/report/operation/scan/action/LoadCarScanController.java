package com.ane.report.operation.scan.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.common.util.HttpConstants;
import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.scan.model.LoadCarScanDetailVO;
import com.ane.report.operation.scan.model.LoadCarScanVO;
import com.ane.report.operation.scan.service.ILoadCarScanService;

/**
 * @ClassName: LoadCarScanController
 * @Description: 装车扫描管理
 * @date 2016年1月13日 下午2:16:24
 */
@Controller
@RequestMapping("/scan")
public class LoadCarScanController{
	
	@Resource
	private ILoadCarScanService loadCarScanService;
	
//	private WeightScanVO weightScanVO;
	
	/**
	 * 装车扫描管理页面
	 * @return
	 */
	@RequestMapping(value="/toLoadCarScanPage")
	public String toWeighScanPage(){
		return "opreation/scan/loadCarScan";
	}
	@RequestMapping(value="/queryLoadCarScan",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<LoadCarScanVO> queryLoadCarScan(LoadCarScanVO loadCarScanVO,Integer pageNum,Integer pageSize){
		PagedResult<LoadCarScanVO> pageResult = new PagedResult<LoadCarScanVO>();
		try {
			pageResult = loadCarScanService.queryLoadCarScanByPage(loadCarScanVO, pageNum, pageSize);
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_FALSE);
			return pageResult;
		} catch (Exception e) {
			e.printStackTrace();
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_TRUE);
			pageResult.setErrorMsg(HttpConstants.SYSTEM_ERROR_MSG);
			return pageResult;
		}
	}
	/**
	 * 通过任务号查询数据
	 * @param loadCarScanDetailVO
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/queryLoadCarScanByTastNum",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<LoadCarScanDetailVO> queryLoadCarScanByTastNum(LoadCarScanDetailVO loadCarScanDetailVO,Integer pageNum,Integer pageSize){
		PagedResult<LoadCarScanDetailVO> pageResult = new PagedResult<LoadCarScanDetailVO>();
		try {
			pageResult = loadCarScanService.queryLoadCarScanByTastNum(loadCarScanDetailVO, pageNum, pageSize);
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_FALSE);
			return pageResult;
		} catch (Exception e) {
			e.printStackTrace();
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_TRUE);
			pageResult.setErrorMsg(HttpConstants.SYSTEM_ERROR_MSG);
			return pageResult;
		}
	}
	
	/**
	 * 时间参数的处理
	 * @param binder
	 */
	@InitBinder    
	public void initBinder(WebDataBinder binder) {    
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
	        dateFormat.setLenient(false);    
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	}  
	
	
}