/**
 * @Title: MD5Util.java
 * @Package com.ane.report.common.util
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:*****信息技术有限责任公司
 * 
 * @author Comsys-xuanning
 * @date 2016年6月3日 下午12:55:59
 * @version V1.0
 */

package com.ane.report.common.util;

import java.security.MessageDigest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: MD5Util
 * @Description: TODO
 * @author Comsys-xuanning
 * @date 2016年6月3日 下午12:55:59
 */
public class MD5Util {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(MD5Util.class);

	 /*** 
     * MD5加密 生成32位md5码
     * @param 待加密字符串
     * @return 返回32位md5码
     */
    public static String md5Encode(String inStr) throws Exception {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
        	LOGGER.error("{}",e);
            return "";
        }

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    /**
     * 测试主函数
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        String str = new String("admin123");
        LOGGER.info("原始：{}" , str);
        LOGGER.info("MD5后：{}" , md5Encode(str));
    }
}
