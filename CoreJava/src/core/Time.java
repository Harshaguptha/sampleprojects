package core;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.joda.time.DateTime;

public class Time {
public static void main(String[] args) throws ParseException {
	/*long lStartTime = System.currentTimeMillis();
    System.out.println(lStartTime);
	long lEndTime = System.currentTimeMillis();

	long difference = lEndTime - lStartTime;
System.out.println(lEndTime);

	System.out.println("Elapsed milliseconds: " + difference);*/
	
/*	long lStartTime = new Date().getTime();
	System.out.println(lStartTime);
	//some tasks
	long lEndTime = new Date().getTime();
System.out.println(lEndTime);
	long difference = lEndTime - lStartTime;

	System.out.println("Elapsed milliseconds: " + difference);*/
	
/*	Calendar calendar = Calendar.getInstance();
	calendar.setTimeZone(TimeZone.getTimeZone("IST"));
	calendar.setTimeInMillis(new Date().getTime());
	//calendar.setTime(<--date object of gmt date-->); 
	SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy 'at' hh:mm:sss a");
	sdf.setTimeZone(TimeZone.getDefault());
	String start=sdf.format(calendar.getTime());
	// long l = Long.parseLong(start);
    // System.out.println("long l = " + l);
	String end=sdf.format(calendar.getTime());
	//String elapsed=start-end;
	System.out.println(start);*/
	
	  Date today = new Date();
	  long lStartTime = System.currentTimeMillis();
      //displaying this date on IST timezone
      DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
      df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
      TimeZone indiatimezone = df.getTimeZone();
      String IST = df.format(today);
      long lEndTime = System.currentTimeMillis();

  	  long difference = lEndTime - lStartTime;
     // System.out.println(lEndTime);
      
      System.out.println("Elapsed milliseconds: " + difference);
     // System.out.println(starts-ends);
      System.out.println("Date in Indian Timezone (IST) : " + IST);

	
      DateTime dt = new DateTime();
      String monthName = dt.monthOfYear().getAsText();
      String frenchShortName = dt.monthOfYear().getAsShortText(Locale.ENGLISH);
      boolean isLeapYear = dt.year().isLeap();
      DateTime rounded = dt.dayOfMonth().roundFloorCopy();
      System.out.println("time zone "+monthName+":frenchshortcutName"+frenchShortName+"isleapyear"+isLeapYear+"rounded"+rounded);
      
      
      //TimeZone timeZone = TimeZone.getDefault();

      TimeZone timeZone = TimeZone.getTimeZone("Asia/Calcutta");
      System.out.println(timeZone.getDisplayName());
      System.out.println(timeZone.getID());
      System.out.println(timeZone.getOffset( System.currentTimeMillis() ));
      //timeZone.getTimeZone();

	
}
}
