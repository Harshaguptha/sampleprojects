package core;

import java.util.Map;
import java.util.Set;

public class ProcessBuilderEx {

	public static  String KeyValue=null;
	public String Value=null;
    public static  String getValue(){
	    ProcessBuilder pb = new ProcessBuilder("/bin/sh"); // or any other program you want to run

	    Map<String, String> envMap = pb.environment();

	    envMap.put("SLALogging", "TRUE");
	    Set<String> keys = envMap.keySet();
	    for(String key:keys){
	        //System.out.println(key+" ==> "+envMap.get(key));
	        if(key=="SLALogging"){
	        	KeyValue=envMap.get(key);
	        	System.out.println("KeyValue :;"+KeyValue);
	        }
	    }
		return KeyValue;
	
}
}