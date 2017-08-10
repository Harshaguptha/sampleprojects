package core;

import java.util.Map;
import java.util.Set;

public class ContinuosRunning implements Runnable {
	 ProcessBuilder pb = new ProcessBuilder("/bin/sh"); // or any other program you want to run
@Override
     public void run() {

         while (true) {
             

     	    Map<String, String> envMap = pb.environment();

     	    envMap.put("SLALogging", "TRUE");
     	    System.out.println("Environment is set successfully");
     	    Set<String> keys = envMap.keySet();
     	    for(String key:keys){
     	        //System.out.println(key+" ==> "+envMap.get(key));
     	        if(key=="SLALogging"){
     	        	String KeyValue=envMap.get(key);
     	        	System.out.println("KeyValue :;"+KeyValue);
     	        }
     	    }
     	    try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
 	    }
     }
     	    
     	    
         
	 public static void main(final String[] args) {
		
		 ContinuosRunning cr = new ContinuosRunning();
		  Thread thread = new Thread(cr);

	        thread.setDaemon(true);
	        thread.start();

	        
	    }

}

