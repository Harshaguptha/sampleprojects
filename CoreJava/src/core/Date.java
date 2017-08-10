package core;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Date {

	public static void main(String[] args) {
		/*  Date today = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	      df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
	      TimeZone indiatimezone = df.getTimeZone();
	      String IST = df.format(today);
	      System.out.println(IST);*/
		GregorianCalendar gc = new GregorianCalendar();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s = sdf.format(gc.getTime());
		System.out.println(s);
	}
	
}
