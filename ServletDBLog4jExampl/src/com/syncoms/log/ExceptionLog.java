package com.syncoms.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.syncoms.cmn.startup.ServerStartup;

/** this class creates ExceptionLog logger object.
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
public class ExceptionLog implements ILog {

	private static ExceptionLog objExceptionLog = null;
	public static final Logger exceptionLogger = Logger.getLogger("ExceptionLog");

	
	/*
	 * getInstance
	 */
	public synchronized static ILog getInstance() {
		if (objExceptionLog == null) {
			try {
				PropertyConfigurator.configure(ServerStartup.PROJECT_ABSOLUTE_PATH+"WEB-INF/classes/resources/log4j.properties");
				//exceptionLogger.getRootLogger().addAppender(null);
				objExceptionLog = new ExceptionLog();
			} catch (Exception e) {
				 e.printStackTrace();
				 exceptionLogger.warn(e.getMessage(), e);
			}
		}
        System.out.println("ExceptionLog.getInstance()");
		return objExceptionLog;
	}

	/*
	 * setLogLevel (non-Javadoc)
	 * 
	 * @see
	 * com.nest.macaw.arc.sl.cmn.service.log.ILog#setLogLevel(java.lang.String)
	 */
	public void setLogLevel(String level) {
		exceptionLogger.setLevel(Level.toLevel(level));

	}

}
