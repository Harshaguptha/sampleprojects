package com.syn.ReadProperties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class PropertiesRetrieve {
	public String getPropValues() throws IOException {
		 
		String result = "";
		Properties prop = new Properties();
		String propFileName = "Resources\\Config.properties";
 
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
		if (inputStream != null) {
			prop.load(inputStream);
		} else {
			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}
 
		Date time = new Date(System.currentTimeMillis());
 
		// get the property value and print it out
		String user = prop.getProperty("Name");
		String company1 = prop.getProperty("class");
		String company2 = prop.getProperty("Distic");
		String company3 = prop.getProperty("work");
 
		result = "Employ Details = " + user + ", " + company1+", " + company2 + ", " + company3;
		System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
		return result;
	}
}
