package com.syn.serv;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;




public class HelloWorld extends HttpServlet {
	 
	  private String message;
	  private static final Map<Level,String> logs =  new HashMap<Level,String>();
	  {
	        logs.put(Level.INFO, "I am happy!");
	        logs.put(Level.WARN, "I am concerned...");
	        logs.put(Level.ERROR, "I am in trouble, something went wrong.");
	        logs.put(Level.DEBUG, "I am up, I am down, I am all around!");
	  }

	  public void init() throws ServletException
	  {
	      message = "Hello World";

		  Logger logger = LogManager.getLogger(HelloWorld.class);

	        int next = 0;
	        for(;;){
	            Map.Entry<Level,String> entry = (Entry<Level, String>) logs.entrySet().toArray()[next];
	            logger.log(entry.getKey(), entry.getValue());
	            next = new Random().nextInt(logs.size());
	            try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }

	    
	      // Do required initialization
	      
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	  }
	  
	  public void destroy()
	  {
	      // do nothing.
	  }
	}

