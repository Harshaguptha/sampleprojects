package com.syn.ReadProperties;

import java.io.IOException;

public class PropertiesMain {
	
public static void main(String[] args) {
	
	 PropertiesRetrieve pr=new PropertiesRetrieve();
	 try {
		pr.getPropValues();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
