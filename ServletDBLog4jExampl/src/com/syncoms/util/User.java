package com.syncoms.util;

import java.io.Serializable;
/** this class setter and getter values for registration form.
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 6297385302078200511L;
	
	private String name;
	private String email;
	private int id;
	private String country;
	
	public User(String nm, String em, String country, int i){
		this.name=nm;
		this.id=i;
		this.country=country;
		this.email=em;
	}
	/**
	 * Sets the name field value in the registration form.
	 *
	 * @param name  the name of the registration person.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Sets the email field value in the registration form.
	 *
	 * @param email  the email of the registration person.
	 */

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets the id field value in the registration form.
	 *
	 * @param id  the id of the registration person.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Sets the country field value in the registration form.
	 *
	 * @param country  the country of the registration person.
	 */

	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * Gets the name field  value in the registration form.
	 *
	 * @return name  the name of the registration person.
	 */

	public String getName() {
		return name;
	}
	/**
	 * Gets the email field  value in the registration form.
	 *
	 * @return email  the email of the registration person.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Gets the id field value in the registration form.
	 *
	 * @return id  the id of the registration person.
	 */
	public int getId() {
		return id;
	}
	/**
	 * Gets the country field  value in the registration form.
	 *
	 * @return country  the country of the registration person.
	 */
	public String getCountry() {
		return country;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Name="+this.name+", Email="+this.email+", Country="+this.country;
	}
}
