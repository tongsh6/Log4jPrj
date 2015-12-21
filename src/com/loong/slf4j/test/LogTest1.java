package com.loong.slf4j.test;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest1 {
//	private static final Logger logger = LoggerFactory.getLogger(LogTest1.class);
	private static String[] str = { "1", "2", "3", "4", "5", "6", "7" };

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String strTemp = "";
			for (int j = 0; j <= 31; j++) {
				strTemp += str[getRandomNum()];
				if ((j + 1) % 4 == 0) {
					strTemp += " ";
				}
			}
//			logger.debug(strTemp);
			System.out.println(strTemp);
		}
	}

	public static int getRandomNum() {
		int max = 7;
		int min = 0;
		Random random = new Random();

		return random.nextInt(max) % (max - min + 1) + min;
	}
}
