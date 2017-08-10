package core;

public class CustomSystemProperties {
	static String key=null;
	static{
		    key = "SLALogging";
	   }
	public static void main(String args[]) {
	   
	    System.setProperty(key, "TRUE");
	    System.out.println(System.getProperty(key));
	}
}
