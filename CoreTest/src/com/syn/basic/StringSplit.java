package com.syn.basic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringSplit {
	
		   public static void main(String args[]){
		      String str = new String("Welc//:ome-to-Tut$7152)sjdfjsf(1ori//:alspo //:int.com");

		      /*System.out.println("Return Value :" );
		      for (String retval: Str.split("-", 2)){
		         System.out.println(retval);
		      }*/
		      System.out.println("");
		      System.out.println("Return Value :" );
		      
		      String removeString=str.replaceAll("s*[^a-zA-Z]+", "");
		      System.out.println("this is removeble string"+removeString);
		     /* for (String retval: Str.split("s*[^a-zA-Z]+"){
		         System.out.print(retval+"");
		      }*/
		      /*System.out.println("");
		      System.out.println("Return Value :" );
		      for (String retval: Str.split("-", 0)){
		         System.out.println(retval);
		      }
		      System.out.println("");
		      System.out.println("Return Value :" );
		      for (String retval: Str.split("-")){
		         System.out.println(retval);
		      }*/
		      HashMap<String , String> hmp=new HashMap<>();
		      hmp.put("one", "this is first String");
		      Set<Entry<String, String>> s= hmp.entrySet();
		      
		      System.out.println("this is entryset method::"+s);
		      
		      
		      String s2=new String("madhu sudhan Reddy");
		      String str4=s2.split(",").toString();
		      System.out.println("this is final result for s2 String::"+str4);
		      
		      
		   }
		}

