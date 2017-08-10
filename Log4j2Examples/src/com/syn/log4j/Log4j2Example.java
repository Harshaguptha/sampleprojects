package com.syn.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j2Example {
		static final Logger logger = LogManager.getLogger(Log4j2Example.class.getName());
		public static void main(String[] args) {
			logger.trace("Entering Log4j Example.");
			Hello hello = new Hello();
			if (hello.callMe()) {
				logger.error("Oh!Failed!");
			}
			
			logger.trace("Exiting Log4j Example.");
		}
	}

