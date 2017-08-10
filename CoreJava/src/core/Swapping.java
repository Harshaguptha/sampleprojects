package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swapping {
public static void main(String[] args) throws IOException {
	

	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);  
	  
	System.out.println("Enter first value");  
	String x=br.readLine();  
	int x1=Integer.parseInt(x);
	System.out.println("first "+x);
	System.out.println("Enter second value");  
	String y=br.readLine();  
	int y1=Integer.parseInt(y);
	System.out.println("second "+y);  
	System.out.println("the input values before swap::"+x1 +"and"+y1);
	int temp;
	temp=x1;
	x1=y1;
	y1=temp;
	System.out.println("after swap the variables::"+x1 +"and"+y1);
	
	
}
}