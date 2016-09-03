package com.ane.report.common.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ane.report.common.Service.CommonService;
import com.ane.report.common.model.AuthUser;
import com.ane.report.operation.scan.action.BaseController;
import com.ane.report.operation.scan.model.BasicEmployeeVO;
import com.ane.report.operation.scan.model.BasicSiteVO;
import com.ane.report.operation.scan.model.CustomerVO;

@Controller
public class CommonController extends BaseController{
	@Resource
	private CommonService commonService;
	/**
	 * 模糊查询员工
	 * @param str
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getBasicEmployeeByMatch",method=RequestMethod.POST)
	@ResponseBody
	public List<BasicEmployeeVO> getSiteByMatch(String title,HttpServletRequest request){
		HttpSession session = request.getSession();
		List<BasicEmployeeVO> list=null;
		int rowNum = 5;
		AuthUser user =(AuthUser)session.getAttribute("user");
		if(user!=null){
			list=commonService.queryEmpByPNC(title, rowNum);
		}else{
			list=commonService.queryEmpByPNC(title, rowNum);
		}
		return list;
	}
	/**
	 * 模糊查询客户
	 * @param param
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getCustomerByMatch",method=RequestMethod.POST)
	@ResponseBody
	public List<CustomerVO> queryCustomer(String title){
		int rowNum = 5;
		List<CustomerVO> list=commonService.queryCustomer(title, rowNum);
		return list;
	}
	/**
	 * 模糊查询网点
	 * @param pNameCode
	 * @return
	 */
	@RequestMapping(value="getBasicSiteByMatch",method=RequestMethod.POST)
	@ResponseBody
	public List<BasicSiteVO> getSiteByEmployeeId(String pNameCode/*,HttpServletRequest request*/){
		int rownum=5;
		/*HttpSession session = request.getSession();
		AuthUser user =(AuthUser)session.getAttribute("user");*/
		List<BasicSiteVO> lists=commonService.querySiteByLike(pNameCode, rownum/*,user.getSiteId()*/);
		return lists;
	}
}
