
package com.syn.basic;

public class ClassDemo {

/**
 * The main method.
 *
 * @param args the arguments
 * @throws ClassNotFoundException the class not found exception
 * @throws NoSuchMethodException the no such method exception
 * @throws SecurityException the security exception
 * @throws ClassCastException the class cast exception
 */
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,ClassCastException {
	Class<?> clss=Class.forName("com.syn.basic.Address");
	
	System.out.println("the class name is getting::"+clss.getModifiers());
	System.out.println("the canonical name :"+clss.getCanonicalName());
	System.out.println("this is class hash code:"+clss.hashCode());
	System.out.println("This is getclass loader::"+clss.getClassLoader());
	System.out.println("this is it is enum or not:"+clss.isEnum());
	System.out.println("This class constructor::"+clss.getConstructor(null));
	/*System.out.println("this is it is a subclass or not"+clss.asSubclass(null));*/
	System.out.println("this is assertion status"+clss.desiredAssertionStatus());
	System.out.println("the class name is getting::"+clss.getName());
	System.out.println("the simple class name is getting::"+clss.getSimpleName());
	System.out.println("the class pakage name is getting ::"+clss.getPackage());
	
	}
}
