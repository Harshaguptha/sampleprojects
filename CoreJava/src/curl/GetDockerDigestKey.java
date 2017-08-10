package curl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetDockerDigestKey {
public static void main(String[] args) {

	 String username="symphoni1";
	    String password="11@@##33";
	    String url="https://registry.symphoni.io/v2/ef/cc/manifests/v62";
	    String accptJson="Accept: application/vnd.docker.distribution.manifest.v2+json";
	    String[] command = {"curl", "-H", "Accept:application/json", "-u", username+":"+password , url,};
	        ProcessBuilder process = new ProcessBuilder(command); 
	        Process p;
	        try
	        {
	            p = process.start();
	             BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
	                StringBuilder builder = new StringBuilder();
	                String line = null;
	                while ( (line = reader.readLine()) != null) {
	                        builder.append(line);
	                        builder.append(System.getProperty("line.separator"));
	                }
	                String result = builder.toString();
	                System.out.print(result);

	        }
	        catch (IOException e)
	        {   System.out.print("error");
	            e.printStackTrace();
	        }
}
}

