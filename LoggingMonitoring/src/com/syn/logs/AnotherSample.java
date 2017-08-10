package com.syn.logs;

import org.apache.log4j.Logger;

public class AnotherSample {
	 private static final  Logger logger=LogUtils.getLogger();
void m1(){
	System.out.println("this is Another sample clsss method");
	logger.info("this is info messagein m1() methos in Another sample calss");
	
}
}
