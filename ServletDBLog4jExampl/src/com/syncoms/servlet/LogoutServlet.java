package com.syncoms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
import com.syncoms.log.TransactionLog;
/** this class LogoutServlet is provide Logout information for users.
 * And it will check JSESSIONID and COOKIES name is equal or not.
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
@WebServlet(name = "Logout", urlPatterns = { "/Logout" })
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//static Logger logger = Logger.getLogger(LogoutServlet.class);
      
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	Cookie[] cookies = request.getCookies();
    	if(cookies != null){
    	for(Cookie cookie : cookies){
    		if(cookie.getName().equals("JSESSIONID")){
    			TransactionLog.transactionLog.info("JSESSIONID="+cookie.getValue());
    			//logger.info("JSESSIONID="+cookie.getValue());
    			break;
    		}
    	}
    	}
    	//invalidate the session if exists
    	HttpSession session = request.getSession(false);
    	TransactionLog.transactionLog.info("User  Logout Details::"+session.getAttribute("User"));
    	//logger.info("User  Logout Details::"+session.getAttribute("User"));
    	if(session != null){
    		session.invalidate();
    	}
    	TransactionLog.transactionLog.info("User Logout successfully");
    	//logger.info("User Logout successfully");

    	response.sendRedirect("login.html");
    }

}
