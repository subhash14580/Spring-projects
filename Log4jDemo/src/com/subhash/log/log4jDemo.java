package com.subhash.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {
	private final static Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		System.out.println("Hello World Program !");
		logger.info("This is subhash");
		logger.debug("This is other applications");
		logger.info("This is the info loffer");
		logger.error("This is null pointer exception",new NullPointerException());
	}
}
