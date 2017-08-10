package com.syncoms.servlet;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.syncoms.log.ExceptionLog;
import com.syncoms.log.TransactionLog;
import com.syncoms.util.User;
/** this class provides login information per particular user is authorized or not.
 * And its provide field validations.
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
@WebServlet(name = "Login", urlPatterns = { "/Login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*public static Logger logger = Logger.getLogger(LoginServlet.class);*/
	String s=this.getClass().getName();
	public static Logger exceptionLogger= Logger.getLogger("AppLogging");
	
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//System.out.println("---------->"+request.getHeader("User-Agent"));
		String errorMsg = null;
		if(email == null || email.equals("")){
			errorMsg ="User email can't be empty";
		}
		if(password == null || password.equals("")){
			errorMsg = "Password can't be empty";
		}
		if(errorMsg != null){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>"+errorMsg+"</font>");
			rd.include(request, response);
		}else{
		
		Connection con = (Connection) getServletContext().getAttribute("DBConnection");
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select id, name, email,country from Users where email=? and password=? ");
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			/*Boolean islogged=false;
			islogged=rs.next();*/
			if(rs!=null){
				rs.next();
				/*logger.error("User not found with email="+email);
				logger.error("User not found with email="+password);*/
				User user = new User(rs.getString("name"), rs.getString("email"), rs.getString("country"), rs.getInt("id"));
				TransactionLog.transactionLog.info("User found with details::"+user);
				//logger.info("User found with details::"+user);

				//logger.info("User found with details::"+user);
				HttpSession session = request.getSession();
				session.setAttribute("User", user);
				response.sendRedirect("home.jsp");
				//islogged=true;
				
			}else{
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
				PrintWriter out= response.getWriter();
				//logger.error("User not found with email="+email);
				//logger.error("User not found with password="+password);

				/*logger.error("User not found with email="+email);
				logger.error("User not found with password="+password);*/
				out.println("<font color=red><h3>sorry you entered wrong mail id and password</h3></font>");
				out.println("<font color=red>No user found with given email id, please register first.</font>");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			CharArrayWriter cw = new CharArrayWriter();
		    PrintWriter w = new PrintWriter(cw);
		    e.printStackTrace(w);
		    w.close();
		    String trace = cw.toString();
			//e.printStackTrace();
			    
			//System.err.println("you enter unauthorized Details::"+e);
			//ExceptionLog.exceptionLogger.error("User not found with email="+email+"and Password2="+password);
			//ExceptionLog.exceptionLogger.error("User not found with password="+password);
//			logger.error("User not found with email="+email+" "+"and Password1="+password);
			//logger.error("User not found with password="+password);
			//ExceptionLog.exceptionLogger.error("User entered wrong email-id or password"+e.getStackTrace().length);
			ExceptionLog.exceptionLogger.error(trace);
//			logger.error("Exception Details1:"+trace);
			//ExceptionLog.exceptionLogger.error(e,e);
			/*exceptionLogger.error("User not found with email="+email);
			exceptionLogger.error("User not found with password="+password);
			exceptionLogger.error("User entered wrong email-id or password",e);*/
			//System.err.println("hello there is an exception!!!");
			//response.getWriter().println("hello there is an exception!!!");
			throw new ServletException(e);
		}		
		finally{
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				ExceptionLog.exceptionLogger.info(e.getMessage(),e);

				/*logger.error("SQLException in closing PreparedStatement or ResultSet"+e);;*/
			}
			
		}
		}
	}

}
