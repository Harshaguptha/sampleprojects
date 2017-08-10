package com.syn.simplecore;

public class SingletonInstancer {

	public static void main(String[] args) {
		//SingletonClassic sc=new SingletonClassic();
		SingletonClassic.getInstance();
		//SingletonClassic anothersc=new SingletonClassic();
		/*anothersc.getInstance();
		System.out.println("this is firstinstance:"+sc);
		System.out.println("this is second instance:"+anothersc);*/
	}
}
