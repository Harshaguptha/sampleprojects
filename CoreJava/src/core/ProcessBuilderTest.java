package core;

import java.util.Map;
import java.util.Set;

public class ProcessBuilderTest {
	
public static void main(String[] args) {
/*	 ProcessBuilder pb = new ProcessBuilder("/bin/sh"); // or any other program you want to run

	    Map<String, String> envMap = pb.environment();
	   // System.out.println("envMap \n"+envMap);
	    
	    System.out.println("key: "+envMap.get("SLALogger"));
	    
	    
	    System.out.println(" "+ System.getenv("SLALogger"));

	   // System.out.println(" "+ System.getenv("Java_Home"));
*/	
/*ProcessBuilder pb = new ProcessBuilder("/bin/sh"); // or any other program you want to run
		    Map<String, String> envMap = pb.environment();*/
		    /*envMap.clear();
		    envMap.put("SLALogger", "true");
		    envMap.put("DevErrorLogger", "false");*/
		    
		    /*Set<String> keys = envMap.keySet();
		    for(String key:keys){
		    	if(key.equals("SLALogger") ){
		        System.out.println(key+" ==> "+envMap.get("SLALogger"));
		    	}else if(key.equals("DevErrorLogger")){
		      System.out.println(key+" ==> "+envMap.get("DevErrorLogger"));
		      	}
		    	//System.out.println(key+" ==> "+envMap.get(key));
		    } */
		    
		    
	
	
	ProcessBuilder pb = new ProcessBuilder("/bin/sh"); // or any other program you want to run

    Map<String, String> envMap = pb.environment();

    Set<String> keys = envMap.keySet();
    for(String key:keys){
        System.out.println(key+" ==> "+envMap.get(key));
    }
}
}
