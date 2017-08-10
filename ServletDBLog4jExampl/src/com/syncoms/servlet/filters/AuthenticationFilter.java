package com.syncoms.servlet.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.syncoms.log.TransactionLog;

/** this class will check the the given request is Authorized or not.
 * this is a filter class it will be load at server startup only.
 * this class is configured in web.xml
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
public class AuthenticationFilter implements Filter {

	//private Logger logger = Logger.getLogger(AuthenticationFilter.class);
	
	public void init(FilterConfig fConfig) throws ServletException {
		TransactionLog.transactionLog.info("AuthenticationFilter is initialized");
		//logger.info("AuthenticationFilter is initialized");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		//System.out.println("---------->"+req.getHeader("User-Agent")); 
		String uri = req.getRequestURI();
		TransactionLog.transactionLog.info("Requested Resource::"+uri);
		//logger.info("Requested Resource::"+uri);
		
		HttpSession session = req.getSession(false);
		
		if(session == null && !(uri.endsWith("html") || uri.endsWith("Login") || uri.endsWith("Register"))){
			TransactionLog.transactionLog.info(" UnAuthorized access request"+uri);
			//logger.info(" UnAuthorized access request");
			res.sendRedirect("login.html");
		}else{
			// pass the request along the filter chain
			TransactionLog.transactionLog.info("Authorized access request");
			//logger.info("Authorized access request");
			chain.doFilter(request, response);
		}
	}
	public void destroy() {
		//close any resources here
	}

}
