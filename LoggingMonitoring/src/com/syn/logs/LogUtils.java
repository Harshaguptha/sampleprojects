package com.syn.logs;

import org.apache.log4j.Logger;

public class LogUtils extends SecurityManager
{
    public static Logger getLogger()
    {
    	String className = new LogUtils().getClassName();
    	Logger logger = Logger.getLogger(className);
    	return logger;
    }

    private String getClassName()
    {
    	return getClassContext()[2].getName();
    }
}
