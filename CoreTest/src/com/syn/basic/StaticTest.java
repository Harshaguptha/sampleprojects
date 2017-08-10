package com.syn.basic;

public class StaticTest {
	public void m3(){
		StatcMethod.m1();
		System.out.println("this is test class method ");
	}
public static void main(String[] args) {
	//StatcMethod.m1();
	StaticTest st=new StaticTest();
	st.m3();
}
}
