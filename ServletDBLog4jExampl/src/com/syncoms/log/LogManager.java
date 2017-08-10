package com.syncoms.log;
/** this class LogManager creates TransactionLog and ExceptionLog objects.
 * And set the logger level for all Logging objects. 
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
public class LogManager {

	private static final LogManager objLogManager = new LogManager();

	private static TransactionLog objTransactionLog;
//	private static SystemLog objSystemLog;
	private static ExceptionLog objExceptionLog;

	/*                             
	 * getLogManager
	 */
	public static LogManager getLogManager() {

		return objLogManager;
	}
	/*
	 * initLogService
	 */
	public static void initLogService() {
		System.out.println("LogManager.initLogService()");
		LogFactory objLogFactory = LogFactory.getLogFactory();

		objTransactionLog = (TransactionLog) objLogFactory
				.createLog("TransactionLog");
		objTransactionLog.setLogLevel("All");
		objExceptionLog = (ExceptionLog) objLogFactory
				.createLog("ExceptionLog");
		objExceptionLog.setLogLevel("All");
		/*objSystemLog = (SystemLog) objLogFactory
				.createLog("SystemLog");
		objSystemLog.setLogLevel("All");*/
//		objSystemLog.setLogLevel("OFF");
	}

	/*
	 * startAllLogService
	 */
	public static void startAllLogService() {
		objTransactionLog.setLogLevel("All");
		objExceptionLog.setLogLevel("All");
		/*objSystemLog.setLogLevel("All");*/
	}

	/*
	 * startLogService
	 */
	public static void startLogService(String strLoggerType) {
		/*if (strLoggerType.equals("SystemLog")) {
			objSystemLog.setLogLevel("All");
		} else*/ if (strLoggerType.equals("ExceptionLog")) {
			objExceptionLog.setLogLevel("All");
		} else if (strLoggerType.equals("TransactionLog")) {
			objTransactionLog.setLogLevel("All");
		}
	}

	/*
	 * stopAllLogService
	 */
	public static void stopAllLogService() {
		objTransactionLog.setLogLevel("OFF");
		/*objSystemLog.setLogLevel("OFF");*/
		objExceptionLog.setLogLevel("OFF");
	}

	/*
	 * stopLogService
	 */
	public static void stopLogService(String strLoggerType) {
		/*if (strLoggerType.equals("SystemLog")) {
			objSystemLog.setLogLevel("OFF");
		} else*/ if (strLoggerType.equals("ExceptionLog")) {
			objExceptionLog.setLogLevel("OFF");
		} else if (strLoggerType.equals("TransactionLog")) {
			objTransactionLog.setLogLevel("OFF");
		}
	}

	/*
	 * setStatusLevel
	 */
	public static void setStatusLevel(String strLoggerType, String strStatus) {
		/*if (strLoggerType.equals("SystemLog")) {
			objSystemLog.setLogLevel(strStatus);
		} else*/ if (strLoggerType.equals("ExceptionLog")) {
			objExceptionLog.setLogLevel(strStatus);
		} else if (strLoggerType.equals("TransactionLog")) {
			objTransactionLog.setLogLevel(strStatus);
		}
	}

	/*
	 * setAllStatusLevel
	 */
	public static void setAllStatusLevel(String strStatus) {
		objTransactionLog.setLogLevel(strStatus);
//		objSystemLog.setLogLevel(strStatus);
		objExceptionLog.setLogLevel(strStatus);
	}
}
