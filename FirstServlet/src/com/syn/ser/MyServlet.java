package com.syn.ser;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class MyServlet extends HttpServlet{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html");//setting the content type  
			PrintWriter pw=res.getWriter();//get the stream to write the data  
			  
			//writing html in the stream  
			
			pw.println("Welcome to servlet");  
			 
			  
			pw.close();//closing the stream  
			}}  
*/
	public MyServlet() {
		/* No code in the constructor for this demonstration */
		}
		public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		        OutputStream out = response.getOutputStream(); /* Get the output stream from the response object */
		        try {
		                DefaultPieDataset myServletPieChart = new DefaultPieDataset();
		                myServletPieChart.setValue("Maths", 74);
		                myServletPieChart.setValue("Physics", 87);
		                myServletPieChart.setValue("Chemistry", 62);
		                myServletPieChart.setValue("Biology", 92);
		                myServletPieChart.setValue("English", 51);        
		                JFreeChart mychart = ChartFactory.createPieChart("Programming - Colored Pie Chart Example",myServletPieChart,true,true,false);  
		                response.setContentType("image/png"); /* Set the HTTP Response Type */
		                ChartUtilities.writeChartAsPNG(out, mychart, 400, 300);/* Write the data to the output stream */
		        }
		        catch (Exception e) {
		                System.err.println(e.toString()); /* Throw exceptions to log files */
		        }
		        finally {
		                out.close();/* Close the output stream */
		        }
		        }
		}