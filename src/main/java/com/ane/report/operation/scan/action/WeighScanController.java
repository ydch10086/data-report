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
import com.ane.report.operation.scan.model.WeightScanVO;
import com.ane.report.operation.scan.service.IWeighScanService;

/**
 * @ClassName: WeighScanController 
 * @Description: 称重扫描 
 * @author 
 * @date 2016年6月14日 下午6:45:20      
 *
 */
@Controller
@RequestMapping("/scan")
public class WeighScanController extends BaseController{
	
	@Resource
	private IWeighScanService weighScanService;
	
	/**
	 * 称重扫描页面
	 * @return
	 */
	@RequestMapping(value="/toWeighScanPage")
	public String toWeighScanPage(){
		return "opreation/scan/weighScan";
	}
	/**
	 * 
	 * @Title: queryWeighScan 
	 * @Description: 称重扫描列表 
	 * @param weightScanVO
	 * @param pageNum
	 * @param pageSize
	 * @return PagedResult<WeightScanVO>
	 * @throws  
	 * @date 2016年6月14日 下午6:45:50
	 */
	@RequestMapping(value="/queryWeighScan",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<WeightScanVO> queryWeighScan(WeightScanVO weightScanVO,Integer pageNum,Integer pageSize){
		PagedResult<WeightScanVO> pageResult = new PagedResult<WeightScanVO>();
		try {
			pageResult = weighScanService.queryWeighScanByPage(weightScanVO, pageNum, pageSize);
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_FALSE);
			return pageResult;
		} catch (Exception e) {
			e.printStackTrace();
			pageResult.setError(HttpConstants.RESPONSE_RESULT_FLAG_TRUE);
			pageResult.setErrorMsg(responseExceptionInfo(e));
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