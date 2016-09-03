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
import com.ane.report.operation.scan.model.ScanDataVO;
import com.ane.report.operation.scan.service.IScanDataService;

/**
 * 
 *     
 * @ClassName: ScanDataController 
 * @Description: 扫描查询
 * @author 
 * @date 2016年6月15日 下午3:35:39      
 *
 */
@RequestMapping("/scan")
@Controller
public class ScanDataController{
	
	@Resource
	private IScanDataService scanDataService;
	/**
	 * 
	 * @Title: toScanDataByPagePage 
	 * @Description: 扫描查询页面 
	 * @return String
	 * @throws  
	 * @date 2016年6月15日 下午3:36:08
	 */
	@RequestMapping(value="/toScanDataByPagePage")
	public String toScanDataByPagePage(){
		return "opreation/scan/queryScanData";
	}
	
	/**
	 * 
	 * @Title: queryScanDataByPage 
	 * @Description: 扫描查询列表 
	 * @param scanDataVO
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * PagedResult<ScanDataVO>
	 * @throws  
	 * @date 2016年6月15日 下午3:36:50
	 */
	@RequestMapping(value="/queryScanDataByPage",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<ScanDataVO> queryScanDataByPage(ScanDataVO scanDataVO,Integer pageNum,Integer pageSize){
		PagedResult<ScanDataVO> pageResult = new PagedResult<ScanDataVO>();
		try {
			pageResult = scanDataService.queryScanDataByPage(scanDataVO, pageNum, pageSize);
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