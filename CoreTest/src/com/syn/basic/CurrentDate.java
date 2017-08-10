package com.syn.basic;

import java.util.Date;

public class CurrentDate {

	public void getDate(){
		Date date=new Date();
		System.out.println("this is current date:"+date);
		 System.nanoTime();
		System.out.println("the system time in system class...."+System.nanoTime());
		
	}
}
