/**
 * @Title: SessionInterceptor.java
 * @Package ane.data.interceptor
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年1月13日 下午4:16:11
 * @version V1.0
 */

package com.ane.report.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *     
 * @ClassName: SessionInterceptor 
 * @Description: session是否失效 
 * @author 
 * @date 2016年6月16日 下午8:38:26      
 *
 */
@Component("sessionInterceptor")
public class SessionInterceptor extends HandlerInterceptorAdapter implements HandlerInterceptor{

	/**
	 * 过滤的路径
	 */
	private static final String[] IGNORE_URI = { "/login" };
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String requestUrl = request.getRequestURI();

		for (String url : IGNORE_URI) {
			if (requestUrl.endsWith(url)) {
				return true;
			}
		}
		if (request.getSession().getAttribute("user") == null) {
			String path = request.getContextPath();
			// 跳转地址
			String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
			// 进行sendRedirect
			//response.sendRedirect(basePath + "login");
			PrintWriter out = response.getWriter(); 
			out.println("<html><head><script>parent.location.href='"+basePath + "login"+"';</script></head></html>");
			out.flush();
			return false;
		}
		return true;
	}
}
