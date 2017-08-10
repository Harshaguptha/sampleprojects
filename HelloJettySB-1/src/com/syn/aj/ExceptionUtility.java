package com.syn.aj;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtility {

	public static String exTrace(Throwable e){
		StringWriter trace= new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		return trace.toString();
	}
}
