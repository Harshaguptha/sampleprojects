package com.syncoms.cmn.startup;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.syncoms.log.ExceptionLog;
import com.syncoms.log.LogManager;
import com.syncoms.log.TransactionLog;

/** this class load the  at the time of server startup
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-11-28
 *
 */
public class ServerStartup implements ServletContextListener{
	
	public static String PROJECT_ABSOLUTE_PATH = "";

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
		this.doServerShutdownTasks();
	}
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		PROJECT_ABSOLUTE_PATH = arg0.getServletContext().getRealPath("/");
		System.out.println(PROJECT_ABSOLUTE_PATH);
		this.doServerStartupTasks();
		
	}
	
	public void doServerStartupTasks(){
		
		try {
			// Logger logger = LogManager.getLogger(ServerStartup.class);

			Logger globalLogger = Logger.getLogger("global"); 
			globalLogger.setUseParentHandlers(false);
			
			
			LogManager.initLogService();
			TransactionLog.transactionLog.info("Server Startup class is loaded");
			//ExceptionLog.exceptionLogger.info("\n\n\n\n\n\n\n\n\nHello World\n\n\n\n\n\n\n\n\n");
			
			/*Logger globalLogger = Logger.getLogger("global");
			Handler[] handlers = globalLogger.getHandlers();
			for(Handler handler : handlers) {
			    globalLogger.removeHandler(handler);
			}*/
			
			
		/*	ExceptionLog.exceptionLogger.info("Hello Exception!");
			TransactionLog.transactionLog.info("Hello Transaction!");
			*/
		
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
		ExceptionLog.exceptionLogger.error(e.getMessage(), e);
		}/*finally{
			RuleEvent objRuleEvent = null;
			objRuleEvent.getHmpInputData();
		}*/
		
	}
	
	public void doServerShutdownTasks(){
	
	}

}
