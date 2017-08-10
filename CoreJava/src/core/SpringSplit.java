package core;

public class SpringSplit {
public static void main(String[] args) {
	
	String name="1,madhu";
	String []message=name.split(",");
	String id=message[0];
	String data=message[1];
	System.out.println("id :"+id+" data :"+data);

	
	
}
}
