package core;

public class Test2 {
	public static void main(String[] args) {
	    
	    String myEnv = System.getenv("label");
		System.out.println(myEnv);
		myEnv ="False";
		System.err.println(myEnv);
	}
}
