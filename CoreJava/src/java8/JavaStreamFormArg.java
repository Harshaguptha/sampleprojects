package java8;

import java.util.Arrays;

public class JavaStreamFormArg {
public static void main(String[] args) {
	System.out.println(Arrays.asList(args).stream().mapToInt(Integer::parseInt).sum());
}
}
