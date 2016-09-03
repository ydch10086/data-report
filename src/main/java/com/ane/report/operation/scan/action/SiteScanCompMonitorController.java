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
import com.ane.report.operation.scan.model.SiteScanCompMonitorVO;
import com.ane.report.operation.scan.service.ISiteScanCompMonitorService;

/**
 * @ClassName: SiteScanCompMonitorController
 * @Description: 网点扫描对比监控
 * @date 2016年1月13日 下午2:16:24
 */
@RequestMapping("/scan")
@Controller
public class SiteScanCompMonitorController{
	@Resource
	private ISiteScanCompMonitorService siteScanCompMonitorService;
	
//	private WeightScanVO weightScanVO;
	
	/**
	 * 网点扫描对比监控页面
	 * @return
	 */
	@RequestMapping(value="/toSiteScanCompMonitorPage")
	public String toSiteScanCompMonitorPage(){
		return "opreation/scan/siteScanCompMonitor";
	}
	
	/**
	 * 网点扫描对比监控查询
	 * @param siteScanCompMonitorVO
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/querySiteScanCompMonitorByPage",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<SiteScanCompMonitorVO> querySiteScanCompMonitorByPage(SiteScanCompMonitorVO siteScanCompMonitorVO,Integer pageNum,Integer pageSize){
		PagedResult<SiteScanCompMonitorVO> pageResult = new PagedResult<SiteScanCompMonitorVO>();
		try {
			pageResult = siteScanCompMonitorService.querySiteScanCompMonitorByPage(siteScanCompMonitorVO, pageNum, pageSize);
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_FALSE);
			return pageResult;
		} catch (Exception e) {
			e.printStackTrace();
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_TRUE);
			pageResult.setErrorMsg(HttpConstants.SYSTEM_ERROR_MSG);
			return pageResult;
		}
	}
	
	@InitBinder    
	public void initBinder(WebDataBinder binder) {    
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
	        dateFormat.setLenient(false);    
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	}  
	
	
}