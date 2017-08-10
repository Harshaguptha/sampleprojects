package com.syn.ReadProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesFile {
public static void main(String[] args) throws IOException {
	 // File file=new File("src/Resources/Config.Properties");
	   FileInputStream fileInput=new FileInputStream(new File("src/Resources/Config.Properties"));
	   Properties properties=new Properties();
	   properties.load(fileInput);
	   
	   Enumeration<Object> enumkey=properties.keys();
	   
	   while (enumkey.hasMoreElements()) {
		String key = (String) enumkey.nextElement();
		String values=properties.getProperty(key);
		
		System.out.println(key+"  :  "+values);
		
	}
}
}
