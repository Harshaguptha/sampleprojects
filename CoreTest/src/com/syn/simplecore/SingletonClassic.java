package com.syn.simplecore;



public class SingletonClassic {
public static SingletonClassic  instance=null;
private SingletonClassic(){
	
}
public static SingletonClassic getInstance(){
	if(instance == null){
		instance = new SingletonClassic();
		
	}
	return instance;
}

}
