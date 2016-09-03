package com.ane.report.common.util;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtils implements ApplicationContextAware {
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(SpringUtils.class);

	private static ApplicationContext context;// 声明一个静态变量保存

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;
	}

	/**
	 * 从spring容器里获取bean
	 * 
	 * @param beanId
	 */
	public static <T> T getBean(String beanId) {
		T bean = null;
		try {
			if (context!=null && StringUtils.isNotEmpty(StringUtils.trim(beanId))) {
				bean = (T)context.getBean(beanId);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
		}
		return bean;
	}

}
