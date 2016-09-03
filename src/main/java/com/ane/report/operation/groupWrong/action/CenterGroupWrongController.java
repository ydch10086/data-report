package com.ane.report.operation.groupWrong.action;

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

import com.ane.report.common.util.PagedResult;
import com.ane.report.operation.groupWrong.model.CenterGroupWrongVO;
import com.ane.report.operation.groupWrong.service.ICenterGroupWongService;
import com.ane.report.operation.scan.action.BaseController;
/***
 * 中心错集
 * @author qiugy
 *
 */
@Controller
@RequestMapping("/groupWrong")
public class CenterGroupWrongController extends BaseController{
	@Resource
	private ICenterGroupWongService centerGroupWrongService;

	@RequestMapping(value = "/toCenterGroupWrongPage")
	public String toCenterGroupWrongPage() {
		return "opreation/scan/centerGroupWrong";
	}
	/**
	 * 查询错录单
	 * @param entity
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/queryEwbByPage", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<CenterGroupWrongVO> queryEwbByPage(CenterGroupWrongVO entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<CenterGroupWrongVO> pageResult = centerGroupWrongService
				.queryEwbByPage(entity, pageNum, pageSize);
		return pageResult;
	}
	/**
	 * 查询错集包
	 * @param entity
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/queryPackByPage", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<CenterGroupWrongVO> queryPackByPage(CenterGroupWrongVO entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<CenterGroupWrongVO> pageResult = centerGroupWrongService
				.queryPackByPage(entity, pageNum, pageSize);
		return pageResult;
	}
	/**
	 * 查询错集包明细
	 * @param entity
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/queryPackItemsByPage", method = RequestMethod.POST)
	@ResponseBody
	public PagedResult<CenterGroupWrongVO> queryPackItemsByPage(CenterGroupWrongVO entity, Integer pageNum,
			Integer pageSize) {
		PagedResult<CenterGroupWrongVO> pageResult = centerGroupWrongService
				.queryPackItemsByPage(entity, pageNum, pageSize);
		System.out.println(entity.toString());
		return pageResult;
	}
	
	@InitBinder    
	public void initBinder(WebDataBinder binder) {    
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
	        dateFormat.setLenient(false);    
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	}  
}
