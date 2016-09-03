package com.ane.report.common.util;
/**
 *     
 * @ClassName: HttpConstants 
 * @Description: 请求常量类 
 * @author 
 * @date 2016年6月14日 下午8:50:34      
 *
 */
public class HttpConstants {

	public static final String SYSTEM_ERROR_MSG = "系统错误";
	
	public static final String REQUEST_PARAMS_NULL = "请求参数为空";

	public static final String SERVICE_RESPONSE_NULL = "服务端返回结果为空";
	
	// 服务端返回成功的标志
	public static final String SERVICE_RESPONSE_SUCCESS_CODE = "AMS00000";
	
	// 服务端返回结果的标志
	public static final String SERVICE_RESPONSE_RESULT_FLAG = "returnCode";
	
	// 服务端返回结果失败的标志
	public static final String SERVICE_RESPONSE_RESULT_MSG = "errorMsg";
	
	// 返回给前段页面成功或失败的标志
	public static final String RESPONSE_RESULT_FLAG_ISERROR = "isError";
	
	public static final boolean RESPONSE_RESULT_FLAG_FALSE = false;
	public static final boolean RESPONSE_RESULT_FLAG_TRUE = true;
	
	// 执行删除操作
	public static final String OPERATION_TYPE_DELETE = "D";

	
}
