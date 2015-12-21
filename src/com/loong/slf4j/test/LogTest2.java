package com.loong.slf4j.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest2 {
	private static final Logger logger = LoggerFactory.getLogger(LogTest2.class);
	public static void main(String[] args) {
		 // 记录debug级别的信息  
        logger.debug("LogTest2.class: This is debug message.");  
        // 记录info级别的信息  
        logger.info("LogTest2.class:This is info message.");  
        // 记录error级别的信息  
        logger.error("LogTest2.class:This is error message.");  
	}
}
