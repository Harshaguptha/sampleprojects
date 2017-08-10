package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class AssendingOrder {
public static void main(String[] args) {
	String[] jsonArray={"v4","v6","v1","v3","v2"};
	//String[] jsonArray={"v4","v6"};
	 /* Arrays.sort(jsonArray);
	  System.out.println(jsonArray);*/
	ArrayList<String> ar = new ArrayList<String>();
	for(int i = 0; i < jsonArray.length; i++) {
	    Arrays.sort(jsonArray);
	    ar.add(jsonArray[i]);
	    
	    String versions=jsonArray[i];
	   // System.out.println(versions);
	    
	   
	    
	    //System.out.print( " " +jsonArray[i]);
	    
	   /* for ( int j = 0 ; j < arr.length - 1 ; i++ )
	    {
	       arr[ i ] = arr[ i + 1 ] ; 
	    }*/
	}
	// System.out.println(ar);
	 
	 if(ar.size()>2){
		 System.out.println(ar);
		 for (int i = 0; i < ar.size() - 2; i++) {
		     System.out.println(ar.get(i));
		}
	 }
	 else{
		 System.out.println("the lengh of aaraylist is lessthan 2");
	 }
}
}
