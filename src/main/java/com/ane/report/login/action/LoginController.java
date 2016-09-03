/**
 * @Title: LoginController.java
 * @Package ane.data.auth
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年1月13日 下午2:16:24
 * @version V1.0
 */

package com.ane.report.login.action;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ane.report.common.dao.IAuthUserDao;
import com.ane.report.common.model.AuthUser;
import com.ane.report.common.util.MD5Util;

/**
 * @ClassName: LoginController
 * @Description: 系统登录
 * @author Comsys-xuanning
 * @date 2016年1月13日 下午2:16:24
 */
@Controller
public class LoginController {
	private final static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private IAuthUserDao authUserRepo;
	
	/**
	  * login
	  * @Title: login
	  * @Description: 登录操作
	  * @author Comsys-xuanning
	  * @return    设定文件
	  * @throws
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam(value="userName",defaultValue="") String userName,
			@RequestParam(value="passWord",defaultValue="") String passWord,RedirectAttributes redirect,HttpSession session){
		LOGGER.info("登录用户名为:{};密码为:{}",userName,passWord);
		String retUrl = "redirect:/login";
		if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(passWord)) {
			return retUrl;
		}
		redirect.addFlashAttribute("userName", userName);
		AuthUser user = this.authUserRepo.getUserByUserName(userName);
		LOGGER.info("登录用户为:{}",user);
		try {
			if (MD5Util.md5Encode(passWord).equals(user.getUserPwd())) {
				retUrl = "/common/home";
				session.setAttribute("user", user);
				return retUrl;
			}
			redirect.addFlashAttribute("errorInfo", "密码不正确");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("{}",e);
		}
		return retUrl;
	}
	/**
	  * login
	  *
	  * @Title: login
	  * @Description: 进入到登陆页面
	  * @author Comsys-xuanning
	  * @param userName
	  * @return    设定文件
	  * @throws
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(@ModelAttribute(value="userName") String userName){
		ModelAndView mv = new ModelAndView("/common/login");
		mv.addObject("userName", userName);
		return mv;
	}
	/**
	  * home
	  * @Title: home
	  * @Description: 跳转到主页面
	  * @author Comsys-xuanning
	  * @return    设定文件
	  * @throws
	 */
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("/common/home");
		return mv;
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/login";
	}
}