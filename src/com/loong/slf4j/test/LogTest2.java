package com.loong.slf4j.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest2 {
	private static final Logger logger = LoggerFactory.getLogger(LogTest2.class);
	public static void main(String[] args) {
		 // ��¼debug�������Ϣ  
        logger.debug("LogTest2.class: This is debug message.");  
        // ��¼info�������Ϣ  
        logger.info("LogTest2.class:This is info message.");  
        // ��¼error�������Ϣ  
        logger.error("LogTest2.class:This is error message.");  
	}
}
