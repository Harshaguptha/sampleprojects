package com.syn.test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class DBTest {

	 private  static Logger logger = Logger.getLogger(DBTest.class);
	    public static void main (String[] args) {
	        //SampleLog sample=new SampleLog();
	        //System.out.println("helo");
	        logger.log(Level.INFO, "I am happy!");
	        logger.log(Level.WARN, "I am concerned...");
	        logger.log(Level.ERROR, "I am in trouble, something went wrong.");
	        logger.log(Level.DEBUG, "I am up, I am down, I am all around!");
	        //System.out.println(System.getProperty("com.sun.management.jmxremote.port"));
	        
	    }
}
