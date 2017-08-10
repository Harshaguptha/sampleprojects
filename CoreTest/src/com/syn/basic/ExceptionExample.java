package com.syn.basic;

import org.apache.log4j.Logger;

public class ExceptionExample {
	
	  private  static Logger logger = Logger.getLogger(ExceptionExample.class);

	   public static void main(String args[]){
	      try{
	         int a[] = new int[2];
	         logger.info("this is try block");
	         System.out.println("Access element three :" + a[3]);
	      }catch(ArrayIndexOutOfBoundsException e){
	         logger.error("Exception thrown  :" + e);
	    	  
	    	  System.out.println("this is exception block:"+e);
	      }
	      System.out.println("Out of the block");
	   }
	}

