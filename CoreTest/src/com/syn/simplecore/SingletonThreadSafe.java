package com.syn.simplecore;



public class SingletonThreadSafe {
	
	private SingletonThreadSafe(){}
	
	private static class SingletonHolder{
	
		private static final SingletonThreadSafe stsf=new SingletonThreadSafe();
	}
	public static SingletonThreadSafe getInstance(){
		return SingletonHolder.stsf;
	}

}
