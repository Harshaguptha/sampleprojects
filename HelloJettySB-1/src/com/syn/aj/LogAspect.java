package com.syn.aj;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.LinkedHashMap;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.ConstructorSignature;
import org.aspectj.lang.reflect.FieldSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.reflect.SourceLocation;



/**
 * The Class LogAspect.
 */
@Aspect
public class LogAspect {
	int lineNumber;
	MethodSignature signature;
	java.lang.reflect.Method method;
	java.util.Date date ;
	Timestamp timestamp ;
	SourceLocation sourcelocation;
	String classname = "";
	long start ;
	String arguments;
	String prametertypes;
	Class<?>[] parameterTypes = null;

	@Pointcut("execution(* *(..))")
	public void defineEntryPoint() {
	}
/*
	@Before("defineEntryPoint()")
	public void beforeMethod(JoinPoint joinPoint) {

		 start= System.nanoTime();
			date= new java.util.Date();
			timestamp= new Timestamp(date.getTime());

		if (null != joinPoint.getTarget()) {
			classname = joinPoint.getTarget().getClass().getName();
		}
		 lineNumber = joinPoint.getSourceLocation().getLine();

		 signature = (MethodSignature) joinPoint.getSignature();
		 method= signature.getMethod();

		 sourcelocation = joinPoint.getStaticPart()
				.getSourceLocation();
		 
		 final Signature objSignature = joinPoint.getStaticPart().getSignature();
			if (objSignature instanceof MethodSignature) {
				final MethodSignature ms = (MethodSignature) objSignature;
				parameterTypes = ms.getParameterTypes();
				for (final Class<?> pt : parameterTypes) {
					// System.out.println("Method: Parameter type:" + pt);
				}
			}
			if (objSignature instanceof ConstructorSignature) {
				final ConstructorSignature ms = (ConstructorSignature) objSignature;
				final Class<?>[] parameterTypesMS = ms.getParameterTypes();
				for (final Class<?> pt : parameterTypesMS) {
					// System.out.println("Constructor: Parameter type:" + pt);
				}
			}
			if (objSignature instanceof FieldSignature) {
				final FieldSignature fs = (FieldSignature) objSignature;
				// System.out.println("FS: DTN: " + fs.getDeclaringTypeName());
				// System.out.println("FS: DT: " + fs.getDeclaringType());
			}
		 
		 arguments= Arrays.toString(joinPoint.getArgs());

		 prametertypes = Arrays.toString(parameterTypes);

	
	
		
		LinkedHashMap<String, String> linkedHashMapentry=new LinkedHashMap<String, String>();
		
		linkedHashMapentry.put("level", "Entry");
		linkedHashMapentry.put("timestamp", String.valueOf(timestamp));
		linkedHashMapentry.put("location", String.valueOf(sourcelocation));
		linkedHashMapentry.put("class", String.valueOf(classname));
		linkedHashMapentry.put("Method", String.valueOf(method));
		linkedHashMapentry.put("line number", String.valueOf(lineNumber));
		//System.out.println("Before" + joinPoint.getSignature());
		System.out.println("Before---->"+linkedHashMapentry);
	}

	@After("defineEntryPoint()")
	public void afterMethod(JoinPoint joinPoint) {
		
		long end = System.nanoTime();

		long timetaken = end - start;
		
		Object result = null;

		try {
			result = ((ProceedingJoinPoint) joinPoint).proceed();
		} catch (Throwable e) {

			e.printStackTrace();
		}
		
		LinkedHashMap<String, String> linkedHashMapExit = new LinkedHashMap<String, String>();

		linkedHashMapExit.put("level", "Exit");

		linkedHashMapExit.put("timestamp", String.valueOf(timestamp));
		linkedHashMapExit.put("location", String.valueOf(sourcelocation));
		linkedHashMapExit.put("class", String.valueOf(classname));
		linkedHashMapExit.put("Method", String.valueOf(method));
		linkedHashMapExit.put("line number", String.valueOf(lineNumber));
		linkedHashMapExit.put("Inputs", prametertypes + ":" + arguments);

		linkedHashMapExit.put("time Took ", String.valueOf(timetaken));
		linkedHashMapExit.put("Result", String.valueOf(result));


	
		//System.out.println("After" + joinPoint.getSignature());
		System.out.println("After------>" + linkedHashMapExit);
	}
	*/
	@Around("defineEntryPoint()")
	public Object aroundCalling(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		Class<?>[] parameterTypes = null;

		String classname = "";
		if (null != joinPoint.getTarget()) {
			classname = joinPoint.getTarget().getClass().getName();
		}
		int lineNumber = joinPoint.getSourceLocation().getLine();

		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		java.lang.reflect.Method method = signature.getMethod();

		SourceLocation sourcelocation = joinPoint.getStaticPart()
				.getSourceLocation();

		final Signature objSignature = joinPoint.getStaticPart().getSignature();
		if (objSignature instanceof MethodSignature) {
			final MethodSignature ms = (MethodSignature) objSignature;
			parameterTypes = ms.getParameterTypes();
			for (final Class<?> pt : parameterTypes) {
				// System.out.println("Method: Parameter type:" + pt);
			}
		}
		if (objSignature instanceof ConstructorSignature) {
			final ConstructorSignature ms = (ConstructorSignature) objSignature;
			final Class<?>[] parameterTypesMS = ms.getParameterTypes();
			for (final Class<?> pt : parameterTypesMS) {
				// System.out.println("Constructor: Parameter type:" + pt);
			}
		}
		if (objSignature instanceof FieldSignature) {
			final FieldSignature fs = (FieldSignature) objSignature;
			// System.out.println("FS: DTN: " + fs.getDeclaringTypeName());
			// System.out.println("FS: DT: " + fs.getDeclaringType());
		}

		String arguments = Arrays.toString(joinPoint.getArgs());

		String prametertypes = Arrays.toString(parameterTypes);
		java.util.Date date = new java.util.Date();
		Timestamp timestamp = new Timestamp(date.getTime());

		LinkedHashMap<String, String> linkedHashMapEntry = new LinkedHashMap<String, String>();
		linkedHashMapEntry.put("level", "Entry");
		
		linkedHashMapEntry.put("location", String.valueOf(sourcelocation));
		linkedHashMapEntry.put("class", classname);
		linkedHashMapEntry.put("Method", String.valueOf(method));
		linkedHashMapEntry.put("line number", String.valueOf(lineNumber));
		linkedHashMapEntry.put("Inputs", prametertypes + ":" + arguments);



		String enter = "BEFORE Arround: " + joinPoint.getSignature();

	
		System.out.println("Entry ----->"+linkedHashMapEntry);

		Object result = null;

		try {
			result = joinPoint.proceed();
		} catch (Throwable e) {

			// String stackTrace = Throwables.getStackTraceAsString(e);
			String stackTrace = ExceptionUtility.exTrace(e);

			LinkedHashMap<String, String> linkedHashMapException = new LinkedHashMap<String, String>();
			linkedHashMapException.put("level", "Throwing");
			
			linkedHashMapException.put("timestamp", String.valueOf(timestamp));
			linkedHashMapException.put("location", String.valueOf(sourcelocation));
			linkedHashMapException.put("class", String.valueOf(classname));
			linkedHashMapException.put("Method", String.valueOf(method));
			linkedHashMapException.put("line number", String.valueOf(lineNumber));
			linkedHashMapException.put("Inputs", String.valueOf(prametertypes + ":"
					+ arguments));
			linkedHashMapException.put("Stack Trace ", stackTrace);
			
			System.out.println("Exception ----->"+linkedHashMapException);
			
			//LOGGER.throwing(linkedHashMapException);
			//stlog.throwing(linkedHashMapException);

			/*System.out.println("if its throwing an exception ::" + joinPoint
					+ " and the exception details is::" + stackTrace);*/
			// logger.debug("swallow " + e.toString());
		}
		// result= joinPoint.proceed();
		long end = System.nanoTime();
		/**
		 * the get the information what are all information using aspectj
		 */

		String exit = "AFTER Arround: " + joinPoint.getSignature() + " took "
				+ (end - start) + " nanoseconds " + " with  result is "
				+ result;

		long timetaken = end - start;

		LinkedHashMap<String, String> linkedHashMapExit = new LinkedHashMap<String, String>();

		linkedHashMapExit.put("level", "Exit");
		
		linkedHashMapExit.put("timestamp", String.valueOf(timestamp));
		linkedHashMapExit.put("location", String.valueOf(sourcelocation));
		linkedHashMapExit.put("class", String.valueOf(classname));
		linkedHashMapExit.put("Method", String.valueOf(method));
		linkedHashMapExit.put("line number", String.valueOf(lineNumber));
		linkedHashMapExit.put("Inputs", prametertypes + ":" + arguments);

		linkedHashMapExit.put("time Took ", String.valueOf(timetaken));
		linkedHashMapExit.put("Result", String.valueOf(result));

		//System.out.println(exit);
		// logger.info(exit);
		//LOGGER.exit(linkedHashMapExit);
		System.out.println("Exit ----->"+linkedHashMapExit);


		return result;
	}
}