package docker.registry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GetVersionRepo {
	static String output = null;

	public void getVersions(String repo) throws JSONException {

		JSONObject jsonObj = new JSONObject(repo);

		JSONArray jarray = jsonObj.getJSONArray("repositories");
		System.out.println("JSON array is " + jarray);

		for (int i = 0; i < jarray.length(); i++) {
			Object object = jarray.get(i);
			String reponame = object.toString();
			System.out.println("The repo name is :" + reponame);
			try {

				DefaultHttpClient httpClient = new DefaultHttpClient();
				HttpGet getRequest = new HttpGet(
						"http://192.168.6.125:5000/v2/" + reponame
								+ "/tags/list");
				getRequest.addHeader("accept", "application/json");

				HttpResponse response = httpClient.execute(getRequest);

				if (response.getStatusLine().getStatusCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ response.getStatusLine().getStatusCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
						(response.getEntity().getContent())));

				System.out.println(" Output from Server .... ");
				while ((output = br.readLine()) != null) {

					System.out.println(output);
					JSONObject jsonrepoObj = new JSONObject(output);

					JSONArray jsonrepoarray = jsonrepoObj.getJSONArray("tags");
					System.out.println("JSON array of tags is " + jsonrepoarray
							+ "\n");

					if (jsonrepoarray.length() > 2) {
						System.out.println("More Than two values "
								+ jsonrepoarray + "\n");

						ArrayList<String> listdata = new ArrayList<String>();
						if (jsonrepoarray != null) {
							for (int j = 0; j < jsonrepoarray.length(); j++) {
								listdata.add(jsonrepoarray.getString(j));
							}
						}
						
						System.out.println("List of json array values "+ listdata);
					}

				}

				httpClient.getConnectionManager().shutdown();

			} catch (ClientProtocolException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}
}
