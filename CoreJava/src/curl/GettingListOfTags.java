package curl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GettingListOfTags {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = null;

		String[] listofnames = { "security/authentication",
				"esb/twitteradapter", "ef/cc", "ef/cacheefgeneratordata",
				"ef/cg", "wf/caller", "cep/cel", "cep/cepaction",
				"cep/cepblocklymetadata", "cep/cepconditionmetada",
				"cep/cepengine", "cep/cepenginemetadata", "cep/cepprocesser",
				"ui/codelessexecutor", "wf/collector", "wf/condeval",
				"ef/dbinfo", "cep/devicemetadata", "dockerconfigfile",
				"ef/efredirector", "soa/entitydefinition", "esb/esb",
				"esb/esbserviceregistration", "kafka/eventexecutor",
				"eventfabric/eventfabric", "cep/flinkjobbuilder", "ui/login",
				"esb/identityserver", "esb/esb", "ef/jdo", "ui/js",
				"wf/jbuilder", "kafka/kafkatest", "soa/layoutgeneration",
				"ui/layoutobject", "cep/listofevents", "ui/login",
				"wf/logopeflows", "ui/manifest",
				"marketapp/marketplaceappauthtenants", "soa/menugeneration",
				"soa/menus", "ui/metadata", "ui/serviceregistration",
				"soa/modules", "ui/multipopups", "esb/integration",
				"esb/nginx", "ui/nodejs", "ui/pageobjectmanager", "ui/paperjs",
				"ui/parser", "ui/phonegap", "ef/pojo", "ef/pojojdo",
				"ui/popup", "cep/preprocessormetadata", "kafka/publishtokafka",
				"ui/raspi", "wf/readworkflows", "esb/websocket",
				"wf/regwfasservice", "wf/rulemetadata", 
				 "wf/saveworkflow",
				"security/securitycrypto", "security/securitydevicevalidator",
				"security/securitypolicygenerator", "ui/serviceregistration",
				"wf/servicemetadata", "soa/serviceurl",
				"esb/esbsmooksgenerator", "cep/tempevent", "esb/identityserver",
				"soa/transaction", "eventfabric/eventfabric", "ui/erpui",
				"soa/uilayoutmanagement", "soa/uimetadata",
				"ef/virtualization", "soa/websocket", "wf/wfactivities",
				"ui/wfdesigner", "wf/wfdesignerjson", "wf/elasticsearch",
				"wf/wfentities", "wf/receiver", "ui/wfswaroop",
				"esb/websocketdirector", "esb/nginx", "esb/websocket",
				"esb/alexametadata", "esb/callroutingconfig",
				"esb/eventinputs", "soa/httpsse", "ef/newvirtualization",
				"ws/samplews", "poc/samplehttpnginx", "poc/tempservice",
				"ui/jslib", "ui/phonegapmanifest", "ui/servicecall",
				"ui/uieditors" };
		ps = new PrintStream("C:\\Users\\madhusudhan.reddy\\Desktop\\sysoutprinting.txt");

		System.setOut(ps);
		for (int i = 0; listofnames.length > i; i++) {

			System.out.println(listofnames[i]);

			String username = "symphoni1";
			String password = "11@@##33";
			String url = "https://registry.symphoni.io/v2/" + listofnames[i]
					+ "/tags/list";
			String[] command = { "curl", "-H", "Accept:application/json", "-u",
					username + ":" + password, url };
			ProcessBuilder process = new ProcessBuilder(command);
			Process p;
			try {
				p = process.start();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(p.getInputStream()));
				StringBuilder builder = new StringBuilder();
				String line = null;
				while ((line = reader.readLine()) != null) {
					builder.append(line);
					builder.append(System.getProperty("line.separator"));
				}
				String result = builder.toString();
				try {
					JSONObject tagsJson = new JSONObject(result);
					// JSONArray arr = tagsJson.getJSONArray("tags");
					String arr = tagsJson.get("tags").toString();
					JSONArray jsonArray = new JSONArray(arr);
					ArrayList<String> list = new ArrayList<String>();
					for (int k = 0; k < jsonArray.length(); k++) {
						list.add(jsonArray.getString(k));
					}
					System.out.println("Versions ---->" + list);
					Collections.sort(list);
					// System.out.println("After Sorting:");
					List<String> vesionslist = new ArrayList<String>();
					for (String vesions : list) {
						// System.out.println(vesions);
						vesionslist.add(vesions);
					}
					System.out.println("Sorting Versions list --->" + vesionslist);
					
					String[] versionString = new String[vesionslist.size()];
					versionString = vesionslist.toArray(versionString);
					
					if (vesionslist != null && !vesionslist.isEmpty()) {
						if(vesionslist.size()>2){
							for (int l = 0; l < vesionslist.size() - 2; l++) {
							     System.out.println(vesionslist.get(l));
							}					
						}
						else {
							System.out.println(listofnames[i] +" size is less than or equal to 2");
						}
					}				
					else{
						System.out.println(listofnames[i] +"version list is empty");
					}
					
				} catch (JSONException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				System.out.print("error");
				e.printStackTrace();
			}
		}
	}
}