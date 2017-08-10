package core;

public class StringValueOf {
	public static void main(String args[]){
	      double d = 102939939.939;
	      boolean b = true;
	      long l = 1232874;
	      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };
	      String doubleresult=String.valueOf(d);
	      System.out.println("Return Value : " + doubleresult );
	      System.out.println("Return Value : " + String.valueOf(b) );
	      System.out.println("Return Value : " + String.valueOf(l) );
	      System.out.println("Return Value : " + String.valueOf(arr) );
	      StringLength sl=new StringLength();
	      int b1=sl.a;
	      System.out.println("the value of b1 is:::"+b1);
	      
	   }
}
