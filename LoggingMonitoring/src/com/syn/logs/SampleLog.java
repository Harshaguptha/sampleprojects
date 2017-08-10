package com.syn.logs;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
public class SampleLog {
   // LogUtils logutils= new LogUtils();
	private static final  Logger logger=LogUtils.getLogger();
   
	public void myMethod(){
		logger.error("This is error message in myMethod");
	}
    public static void main (String[] args) {
    	//Logger logger=LogUtils.getLogger();
        //SampleLog sample=new SampleLog();
        //System.out.println("helo");
    	SampleLog slog=new SampleLog();
    	slog.myMethod();
        logger.log(Level.INFO, "I am happy!");
        logger.log(Level.WARN, "I am concerned...");
        logger.log(Level.ERROR, "I am in trouble, something went wrong.");
        logger.log(Level.DEBUG, "I am up, I am down, I am all around!");
        //System.out.println(System.getProperty("com.sun.management.jmxremote.port"));
        
        AnotherSample asp=new AnotherSample();
        
        asp.m1();
        
    }
   
}