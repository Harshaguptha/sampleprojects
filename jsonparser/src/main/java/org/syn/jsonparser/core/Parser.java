package org.syn.jsonparser.core;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class Parser {
	
/***
 * Returns all leaf elements with it's values
 * 
 * @param json
 * @return
 */
	public Map<String,Object> parse(String json)
	{
		Map<String, Object> output = new HashMap<String, Object>();
		try
		{	parseJSONObject(new JSONObject(json), output);		
		}
		catch(Exception e)
		{	parseJSONArray(new JSONArray(json), output);
		}
		return output;
	}
	
	private  void parseJSONObject(JSONObject object,Map<String,Object> leaves) {
		Object o = null;	
		String element = null;
		String[] names = JSONObject.getNames(object);
		if (names != null) {
			for (int i = names.length - 1; i >= 0; i--) {
				element = names[i];
				o = object.get(element);
				if (o instanceof JSONObject)
					parseJSONObject((JSONObject)o, leaves);
				else if (o instanceof JSONArray) {				
					parseJSONArray((JSONArray)o,leaves);
				} else { 
					leaves.put(element,object.get(element) );
					
				}
			} 
		} 
	}

	private  void parseJSONArray(JSONArray array, Map<String,Object> leaves) {
		if (array.length() == 0)
			return;
		Object o = array.get(0);
		if (o instanceof JSONObject)
			parseJSONObject((JSONObject)o,leaves);	
	} 
}
