/**    
 * 文件名：SSOLoginServlet.java    
 *    
 * 版本信息：    
 * 日期：2016年6月21日 下午1:36:37
 *    
 */
package com.ane.report.login.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasig.cas.client.validation.Assertion;
import org.springframework.stereotype.Controller;

import com.ane.report.common.dao.IAuthUserDao;
import com.ane.report.common.model.AuthUser;
import com.ane.report.common.util.SpringUtils;

/**
 * 
 * @ClassName: SSOLoginServlet
 * @Description: SSO登陆Servlet
 * @author
 * @date 2016年6月21日 下午1:36:37
 * 
 */
@Controller
public class SSOLoginServlet extends HttpServlet {

	
	 /**    
	 * serialVersionUID:TODO   
	 *    
	 * @since Ver 1.1    
	 */    
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		doPost(arg0, arg1);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object object = request.getSession().getAttribute("_const_cas_assertion_");  
        if (object != null) {  
            if(request.getSession().getAttribute("user") == null){
            	Assertion assertion = (Assertion) object;  
            	String loginName = assertion.getPrincipal().getName();  
            	IAuthUserDao authUserRepo = SpringUtils.getBean("authUserRepo");
            	AuthUser user = authUserRepo.getUserByUserName(loginName);
            	request.getSession().setAttribute("user", user);
            }
            String path = request.getContextPath();
            //获取要跳转的页面
            String service = (String) request.getParameter("service");
            String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
			// 进行sendRedirect
//			response.sendRedirect(basePath + "index");
			response.sendRedirect(basePath + service);
        }
	}

}
