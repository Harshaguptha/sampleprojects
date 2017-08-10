package com.syn.basic;

public class StringLength {
public void giveStrin(String s){
	
	int i=s.length();
	
	System.out.println("the given String lenth is:"+i);
}
public static void main(String[] args) {
	StringLength sl=new StringLength();
//	sl.giveStrin("madhu sudhan Reddy");
	
	    String str = "madhu";
	    int counter = 0;
	    for (int i = 0; i < str.length(); i++) {
	      if (Character.isLetter(str.charAt(i)))
	        counter++;
	    }
	    System.out.println(counter + " letters.");
	  }
}
