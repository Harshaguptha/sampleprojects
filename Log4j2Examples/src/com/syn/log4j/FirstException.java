package com.syn.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstException {
	
	public static final Logger log=LogManager.getFormatterLogger(FirstException.class);
	
	public static void main(String args[]){
	      try{
	         int a[] = new int[2];
	         log.info("enter in to the try block");
	         System.out.println("Access element three :" + a[3]);
	         log.info("enter in to the try block");
	      }catch(ArrayIndexOutOfBoundsException e){
	        // System.out.println("Exception thrown  :" + e);
	         log.error(e);
	      }
	      System.out.println("Out of the block");
	     // log.info("out of the block");
	   }
}
