package core;

public class TEST1 {

public static void main(String[] args) {
    
    String myEnv = System.getProperty("label");
	System.out.println(myEnv);
    
    String myEnv1 = System.getenv("label");
	System.out.println(myEnv1);
	
}
}
