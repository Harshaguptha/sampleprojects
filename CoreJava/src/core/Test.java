package core;

public class Test {
public static void main(String[] args) {
	
    //System.out.println(System.getProperty("SLALogging"));
	System.out.println("Get The Key Value ::: "+ProcessBuilderEx.getValue());
	String myEnv = System.getenv("SLAlog");
	System.out.println(myEnv);
}
}
