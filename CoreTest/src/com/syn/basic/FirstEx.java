package com.syn.basic;


public class FirstEx {
	int c;
public int myFirstMethod(int a,int b){
     c=a+b;
	System.out.println("the result of c is ::"+c);
	return c;
	
}
/*public int myFirstMethod(int d,int e){
	int f=d+e;
	return f;
}*/
public void myFirstMethod(){

	
}
public String mySecondMethod(String s){
	System.out.println(s);
	myFirstMethod(30, 30);
	System.out.println("after calling mysecond method::"+c);
	return s;	
}
/*public Boolean myThirdMethod(){
	return null;
	
}*/
}
