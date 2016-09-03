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
import com.ane.report.operation.scan.model.GroupPackScanDetailVO;
import com.ane.report.operation.scan.model.GroupPackScanVO;
import com.ane.report.operation.scan.service.IGroupPackScanService;

/**
 * @ClassName: GroupPackScanController
 * @Description: 集包扫描管理
 * @date 2016年1月13日 下午2:16:24
 */
@Controller
@RequestMapping("/scan")
public class GroupPackScanController{
	
	@Resource
	private IGroupPackScanService groupPackScanService;
	
//	private WeightScanVO weightScanVO;
	
	/**
	 * 集包扫描页面
	 * @return
	 */
	@RequestMapping(value="/toGroupPackScanPage")
	public String toWeighScanPage(){
		return "opreation/scan/groupPackScan";
	}
	
	/**
	 * 查询集包扫描列表
	 * @param groupPackScanVO
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/queryGroupPackScan",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<GroupPackScanVO> queryGroupPackScan(GroupPackScanVO groupPackScanVO,Integer pageNum,Integer pageSize){
		PagedResult<GroupPackScanVO> pageResult = new PagedResult<GroupPackScanVO>();
		try {
			pageResult = groupPackScanService.queryGroupPackScanByPage(groupPackScanVO, pageNum, pageSize);
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
	 * 通过包条码查询集包扫描详细信息
	 * @param groupPackScanDetailVO
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/queryGroupPackScanDetailBybpcode",method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<GroupPackScanDetailVO> queryGroupPackScanDetailBybpcode(GroupPackScanDetailVO groupPackScanDetailVO,Integer pageNum,Integer pageSize){
		PagedResult<GroupPackScanDetailVO> pageResult = new PagedResult<GroupPackScanDetailVO>();
		try {
			pageResult = groupPackScanService.queryGroupPackScanDetailBybpcode(groupPackScanDetailVO,pageNum, pageSize);
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