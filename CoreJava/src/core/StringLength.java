package core;

import java.util.ArrayList;
import java.util.List;

public class StringLength {
	int a=10;
	public static void main(String args[]) {
		
		String Str1 = new String(
				"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJCT1N1aXRlX0F1dGhTZXJ2ZXIiLCJhdWQiOiJCT0FwcGxpY2F0aW9uIiwibmJmIjoxNDY1ODg0OTQwLCJleHAiOjE0Njg4ODQ5NDAsImNsaWVudF9pZCI6ImNvZGVjbGllbnQiLCJzY29wZSI6InJlYWQiLCJzdWIiOiJib2FkbWluIiwiVGVuYW50SUQiOiIyOTJGRUM3Ni01RjFDLTQ4NkYtODVBNS0wOUQ4ODA5NkYwOTgiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3JvbGUiOiJNYW5hZ2VyIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvZW1haWxhZGRyZXNzIjoicHJhc2FkLm5Ac3luY29tcy5jb20ifQ.6VmxYFqQrh-ruwo4k_aLUlNJJZOjSN88Y8b4t4JTMU8");
List<Integer> list=new ArrayList<Integer>();
		String name="syn-com-bang";
		System.out.print("String Length : ");
		System.out.println(Str1.length());
		String[] result=name.split("-");
		System.out.println(result[1]);

	}
}
