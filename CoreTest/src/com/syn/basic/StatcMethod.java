package com.syn.basic;

public class StatcMethod {
public static void m1(){
	System.out.println("this is static method");
}
public void m2(){
	System.out.println("this is non-static method");
}
	public static void main(String[] args) {
     StatcMethod sc=new StatcMethod();
		sc.m1();
		//sc.m2();
	}

}
