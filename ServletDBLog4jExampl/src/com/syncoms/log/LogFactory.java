package com.syncoms.log;

/** this class load the Database driver and connection is created
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
public class LogFactory {
	private static LogFactory objLogFactory = null;

	private LogFactory() {
	}
	/*
	 * getLogFactory
	 */
	public static LogFactory getLogFactory() {
		if (objLogFactory == null) {
			objLogFactory = new LogFactory();
		}
		return objLogFactory;
	}
	/*
	 * createLog
	 */
	public ILog createLog(String strLogType) {

		if (strLogType.equals("ExceptionLog")) {
			return ExceptionLog.getInstance();
		} else if (strLogType.equals("TransactionLog")) {
			return TransactionLog.getInstance();
			
		}
		
		return null;
	}
}
