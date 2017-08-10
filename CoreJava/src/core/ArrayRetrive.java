package core;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ArrayRetrive {
public static void main(String[] args) {
	PrintStream ps = null;
	try {
		String[] listofnames={"ui/erpui","ui/js","ui/nodejs"};
		ps = new PrintStream("C:\\Users\\madhusudhan.reddy\\Desktop\\sysoutprinting.txt");

		System.setOut(ps);
		for(int i=0; listofnames.length>i;i++){
			System.out.println(listofnames[i]);
			
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	finally{
		ps.close();
		System.out.println("this is final block");
	}
	
	
}
}
