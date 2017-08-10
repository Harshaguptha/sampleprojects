package com.syn.basic;


/**
 * The Class ExamplePojo.
 */
public class ExamplePojo {
 
 /** The sname. */
 private String sname;
 
 /** The age. */
 private int age;
 
 /** The phonenumber. */
 private int phonenumber;

/**
 * Gets the sname.
 *
 * @return the sname
 */
public String getSname() {
	return sname;
}

/**
 * Sets the sname.
 *
 * @param sname the new sname
 */
public void setSname(String sname) {
	this.sname = sname;
}

/**
 * Gets the age.
 *
 * @return the age
 */
public int getAge() {
	return age;
}

/**
 * Sets the age.
 *
 * @param age the new age
 */
public void setAge(int age) {
	this.age = age;
}

/**
 * Gets the phonenumber.
 *
 * @return the phonenumber
 */
public int getPhonenumber() {
	return phonenumber;
}

/**
 * Sets the phonenumber.
 *
 * @param phonenumber the new phonenumber
 */
public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override

public String toString(){
	String s=new String("Te student name is::"+getSname()+"  "+"the student age is :"+getAge()+" "+"the student phone number is:"+getPhonenumber());
	return s;
}
}
