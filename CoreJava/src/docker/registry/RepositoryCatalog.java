package docker.registry;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;


public class RepositoryCatalog {
	static String  output = null;
public static void main(String[] args) {
	
	String repo="";
	try {

		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(
			"http://192.168.6.125:5000/v2/_catalog");
		getRequest.addHeader("accept", "application/json");

		HttpResponse response = httpClient.execute(getRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			   + response.getStatusLine().getStatusCode());
		}

		BufferedReader br = new BufferedReader(
                         new InputStreamReader((response.getEntity().getContent())));

		
		System.out.println("Catalog Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			
			repo=output;
			System.out.println(output);
		}
		GetVersionRepo gv=new GetVersionRepo();
		try {
			gv.getVersions(repo);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		httpClient.getConnectionManager().shutdown();

	  } catch (ClientProtocolException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();
	  }

	}

}
