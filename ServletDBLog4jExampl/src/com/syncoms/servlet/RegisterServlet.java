package com.syncoms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.syncoms.log.TransactionLog;
//import org.apache.log4j.Logger;
import com.syncoms.log.ExceptionLog;
/** This class provides Registration information and it will be stored in database.
 * And its provide field validations.
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
@WebServlet(name = "Register", urlPatterns = { "/Register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//public static final Logger logger = Logger.getLogger(RegisterServlet.class);
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String country = request.getParameter("country");
		String errorMsg = null;
		if(email == null || email.equals("")){
			errorMsg = "Email ID can't be null or empty.";
		}
		if(password == null || password.equals("")){
			errorMsg = "Password can't be null or empty.";
		}
		if(name == null || name.equals("")){
			errorMsg = "Name can't be null or empty.";
		}
		if(country == null || country.equals("")){
			errorMsg = "Country can't be null or empty.";
		}
		
		if(errorMsg != null){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/register.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>"+errorMsg+"</font>");
			rd.include(request, response);
		}else{
		
		Connection con = (Connection) getServletContext().getAttribute("DBConnection");
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("insert into Users(name,email,country, password) values (?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, country);
			ps.setString(4, password);
			
			ps.execute();
			TransactionLog.transactionLog.info("User registered with name is="+name+"email="+email+"country="+country+"password="+password);
			/*TransactionLog.transactionLog.info("User registered with email is="+email);
			TransactionLog.transactionLog.info("User registered with country is="+country);
			TransactionLog.transactionLog.info("User registered with password is="+password);*/
			
			/*logger.info("User registered with name is="+name);
			logger.info("User registered with email is="+email);
			logger.info("User registered with country is="+country);
			logger.info("User registered with password is="+password);*/

			
			//forward to login page to login
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=green>Registration successful, please login below.</font>");
			rd.include(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
			ExceptionLog.exceptionLogger.error("Database connection problem");
			//logger.error("Database connection problem");
			throw new ServletException("DB Connection problem.");
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				ExceptionLog.exceptionLogger.error("SQLException in closing PreparedStatement");
				//logger.error("SQLException in closing PreparedStatement");
			}
		}
		}
		
	}

}
