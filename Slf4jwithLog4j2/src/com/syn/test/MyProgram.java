package com.syn.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyProgram {
	
	public String m1(String anme){
		return anme;
		
	}
public static void main(String[] args) {
	
	
	 Logger log=LoggerFactory.getLogger(MyProgram.class);

	log.debug("this is debug message");
	 System.out.println("this is integration combined with log4j2 and slf4j");
	MyProgram mp=new MyProgram();
	String s=mp.m1("syncoms");
	log.debug("this is debug messge {}", s);
	
}
}
