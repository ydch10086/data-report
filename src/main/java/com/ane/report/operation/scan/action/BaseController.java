package com.ane.report.operation.scan.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.ane.report.common.util.HttpConstants;
import com.ane.report.common.util.JsonDateValueProcessor;

/**
 * Controller基类
 */
public class BaseController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    
    protected final static String DATE_FORMATE = "yyyy-MM-dd";
    
    /**
     * 返回服务端处理结果
     * @param obj 服务端输出对象
     * @return 输出处理结果给前段JSON格式数据
     */
	public String responseResult(Object obj){
		JSONObject jsonObj = null;
		if(obj != null){
		    logger.info("后端返回对象：" +  obj);
		    JsonConfig jsonConfig = new JsonConfig(); 
		    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		    jsonObj = JSONObject.fromObject(obj, jsonConfig);
		    logger.info("后端返回数据：" + jsonObj);
		    if(HttpConstants.SERVICE_RESPONSE_SUCCESS_CODE.equals(jsonObj.getString(HttpConstants.SERVICE_RESPONSE_RESULT_FLAG))){
		    	jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, false);
		    	jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, "");
		    }else{
		    	jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, true);
		    	String errMsg = jsonObj.getString(HttpConstants.SERVICE_RESPONSE_RESULT_MSG);
		    	jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, errMsg==null?HttpConstants.SERVICE_RESPONSE_NULL:errMsg);
		    }
		}
		logger.info("输出结果：" +  jsonObj.toString());
		return jsonObj.toString();
	}
	
	/**
     * 返回成功
     * @param obj 输出对象
     * @return 输出成功的JSON格式数据
     */
	public String responseSuccess(Object obj){
		JSONObject jsonObj = null;
		if(obj != null){
		    logger.info("后端返回对象：" + obj);
		    JsonConfig jsonConfig = new JsonConfig(); 
		    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		    jsonObj = JSONObject.fromObject(obj, jsonConfig);
		    logger.info("后端返回数据：" + jsonObj);
		    jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, false);
		    jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, "");
		}
		logger.info("输出结果：" +  jsonObj.toString());
		return jsonObj.toString();
	}

	/**
	 * 返回成功
	 * @param obj 输出对象
	 * @return 输出成功的JSON格式数据
	 */
	public String responseArraySuccess(Object obj){
		JSONArray jsonObj = null;
		if(obj != null){
			logger.info("后端返回对象：" +  obj);
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			jsonObj = JSONArray.fromObject(obj, jsonConfig);
			logger.info("后端返回数据：" + jsonObj);
		}
		logger.info("输出结果：" +  jsonObj.toString());
		return jsonObj.toString();
	}
	
	/**
     * 返回成功
     * @param obj 输出对象
     * @return 输出成功的JSON格式数据
     */
	public String responseSuccess(Object obj, String msg){
		JSONObject jsonObj = null;
		if(obj != null){
		    logger.info("后端返回对象：" +  obj);
		    JsonConfig jsonConfig = new JsonConfig(); 
		    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		    jsonObj = JSONObject.fromObject(obj, jsonConfig);
		    logger.info("后端返回数据：" + jsonObj);
		    jsonObj.element(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, false);
		    jsonObj.element(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, msg);
		}
		logger.info("输出结果：" +  jsonObj.toString());
		return jsonObj.toString();
	}
	
	/**
     * 返回失败
     * @param errorMsg 错误信息
     * @return 输出失败的JSON格式数据
     */
    public String responseFail(String errorMsg){
    	JSONObject jsonObj = new JSONObject();
    	jsonObj.put(HttpConstants.RESPONSE_RESULT_FLAG_ISERROR, true);
    	jsonObj.put(HttpConstants.SERVICE_RESPONSE_RESULT_MSG, errorMsg);
        logger.info("输出结果：" +  jsonObj.toString());
        return jsonObj.toString();
    }
    /**
     * @Title: responseExceptionInfo 
     * @Description: 返回的异常信息 
     * @param e
     * @return String
     * @throws  
     * @date 2016年6月18日 下午5:15:22
     */
    public String responseExceptionInfo(Throwable e){
    	StackTraceElement[] st = e.getStackTrace();
		StringBuffer buf = new StringBuffer();
		if(st != null && st.length > 0){
			buf.append(" className:");
			buf.append(st[0].getClassName());
			buf.append(" methodName:");
			buf.append(st[0].getMethodName());
			buf.append(" lineNumber:");
			buf.append(st[0].getLineNumber());
			buf.append(" message:");
		}
		if(e.getMessage() == null){
			buf.append(e.getClass().getName());
		}else{
			buf.append(e.getMessage());
		}
		return buf.toString();
    }
    
	
	@InitBinder    
	public void initBinder(WebDataBinder binder) {    
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
	        dateFormat.setLenient(false);    
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	}  

}
