package com.syn.ReadProperties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferReader {
	public static void main(String[] args) throws IOException {
		
	
	 /*BufferedReader br = new BufferedReader(new FileReader("src/Resources/Config.Properties"));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();
	        }
	      
			String everything = sb.toString();
			System.out.println("this is final value is:"+everything);
	    } finally {
	        br.close();
	    }*/
		
		 try(BufferedReader br = new BufferedReader(new FileReader("src/Resources/Config.Properties"))) {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            sb.append(line);
		            sb.append(System.lineSeparator());
		            line = br.readLine();
		        }
		        String everything = sb.toString();
		        System.out.println("this is final value is:\r"+everything);
		    }
		
}
}