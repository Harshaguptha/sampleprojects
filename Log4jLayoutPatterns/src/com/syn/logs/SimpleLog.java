package com.syn.logs;

import org.apache.log4j.Logger;

public class SimpleLog {

	public static final Logger logger=Logger.getLogger(SimpleLog.class);
	public static void main(String[] args) {
		
		logger.trace("this is trace message");
		logger.debug("this i sdebug Message");
		logger.info("this is info message");
		logger.warn("this is warn message");
		logger.fatal("this is fatal message");


	}

}
