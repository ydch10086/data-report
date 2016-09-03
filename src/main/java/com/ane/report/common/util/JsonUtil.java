/**
 * @Title: JsonUtil.java
 * @Package com.dan.cxf.ws.common.util
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年5月29日 上午11:04:43
 * @version V1.0
 */

package com.ane.report.common.util;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.Annotated;  
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

/**
 * @ClassName: JsonUtil
 * @Description: JackSon使用帮助类
 * @author Comsys-xuanning
 * @date 2016年5月29日 上午11:04:43
 */
@Component(value="jsonUtil")
public class JsonUtil {

	private final static Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);
	
	private static final String DEFAULT_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";  
	private static final ObjectMapper objMapper; 
	static{
		SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);  
		objMapper = new ObjectMapper();  
		objMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
			@Override
			public void serialize(Object value, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
				LOGGER.debug("将null对象设置为空字符串");
				jg.writeString("");
			}
		});
		/**
		 * 设置默认时间格式
		 */
		objMapper.setDateFormat(dateFormat);  
		objMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector() {

			/**
			  * @Fields serialVersionUID : TODO
			  */
			private static final long serialVersionUID = 5983925704070715110L;  
			/**
			  * <p>Title: findSerializer</p>
			  * <p>Description:解析注解,如果使用DateTimeFormat注解来注解时间格式则不使用默认时间格式</p>
			  * @param a
			  * @return
			  * @see com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector#findSerializer(com.fasterxml.jackson.databind.introspect.Annotated)
			 */
			public Object findSerializer(Annotated a) {
				if(a instanceof AnnotatedMethod) {  
					AnnotatedElement m=a.getAnnotated();  
					DateTimeFormat an=m.getAnnotation(DateTimeFormat.class);  
					if(an!=null) {  
						if(!DEFAULT_DATE_FORMAT.equals(an.pattern())) {  
							return new JsonDateSerializer(an.pattern());  
						}
					}
				}
				return super.findSerializer(a);  
			}
		});
		/**
		 * 不解析对象不具有的属性
		 */
		objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}
	/**
	  * toJson
	  *
	  * @Title: toJson
	  * @Description: 对象转json
	  * @author Comsys-xuanning
	  * @param obj
	  * @return    设定文件
	  * @throws
	 */
	public static String toJson(Object obj) {  
		try {
			return objMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			LOGGER.error("对象转json出错,{}",e);
			throw new RuntimeException(e); 
		}  
	}
	/**
	  * toBean
	  *
	  * @Title: toBean
	  * @Description: json转对象
	  * @author Comsys-xuanning
	  * @param json
	  * @param clazz
	  * @return    设定文件
	  * @throws
	 */
	public <T> T toBean(String json,Class<T> clazz) {  
		try {
			return objMapper.readValue(json, clazz);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error("将json字符转换为对象时失败!",e);
			throw new RuntimeException("将json字符转换为对象时失败!",e);  
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			LOGGER.error("将json字符转换为对象时失败!",e);
			throw new RuntimeException("将json字符转换为对象时失败!",e);  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.error("将json字符转换为对象时失败!",e);
			throw new RuntimeException("将json字符转换为对象时失败!",e);  
		}  
	}
	
	public ObjectMapper getObjMapper() {  
		return objMapper;
	}
	private static class JsonDateSerializer extends JsonSerializer<Date>{
		private SimpleDateFormat dateFormat;  
		/**
		  * 创建一个新的实例 JsonDateSerializer. 
		  * <p>Title: </p>
		  * <p>Description: </p>
		  * @param pattern
		  */
		
		public JsonDateSerializer(String format) {
			dateFormat = new SimpleDateFormat(format);  
		}

		/**
		  * <p>Title: serialize</p>
		  * <p>Description: </p>
		  * @param value
		  * @param gen
		  * @param serializers
		  * @throws IOException
		  * @throws JsonProcessingException
		  * @see com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
		  */
		@Override
		public void serialize(Date value, JsonGenerator gen,
				SerializerProvider serializers) throws IOException,
				JsonProcessingException {
			gen.writeString(dateFormat.format(value));
		}  
		
	}
}
