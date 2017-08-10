package sample;

public class MaxvalueGivenString {
public static void main(String[] args) {
	int max = Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	//int max =0;
	//int min=0;
	String test = "1, 3, 2, 2, 1, 1, 4, 2, 5, 1, 1, 1, 241";
	String[] testArray = test.split(", ");


	for (int i = 0; i < testArray.length; i++) {
	     if (Integer.parseInt(testArray[i]) > max) {
	         max = Integer.parseInt(testArray[i]);
	         //maxIndex = i;
	        // System.out.println("output :"+maxIndex);
	        
	     }
	     if (Integer.parseInt(testArray[i]) < min) {
	         min = Integer.parseInt(testArray[i]);
	         //maxIndex = i;
	        // System.out.println("output :"+maxIndex);
	        
	     }
	}
	System.out.println(max);
	System.out.println(min);
}

}

