package com.syncoms.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.syncoms.cmn.startup.ServerStartup;

/**  this class creates TransactionLog  logger object.
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
public class TransactionLog implements ILog {

	static private TransactionLog objTransactionLog = null;
	//static private Logger transObject=transactionLog;

	public static final Logger transactionLog = Logger
			.getLogger("TransactionLog");
	//public static final Logger transactionLog=transactionLog1;
	
	/*
	 * getInstance
	 */

	public synchronized static ILog getInstance() {
		if (objTransactionLog == null) {
			try {
				PropertyConfigurator.configure(ServerStartup.PROJECT_ABSOLUTE_PATH+"WEB-INF/classes/resources/log4j.properties");
				
				System.out.println("*********this is Transaction log***************");

				objTransactionLog = new TransactionLog();
			} catch (Exception e) {
				ExceptionLog.exceptionLogger.error(e.getMessage(),e);
			}
		}

		return objTransactionLog;

	}

	
	 
	public void setLogLevel(String level) {
		transactionLog.setLevel(Level.toLevel(level));

	}

}
