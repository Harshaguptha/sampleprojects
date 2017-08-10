package com.syn.sys.info;

import org.apache.commons.lang.SystemUtils;

public class GettingSystemDetails {
public static void main(String[] args) {
	System.out.println("this is for your system information ::");
	
	System.out.println("this is system.country::"+SystemUtils.USER_COUNTRY);
	System.out.println("this is system name::"+SystemUtils.USER_NAME);
	System.out.println("this is system Home::"+SystemUtils.USER_HOME);
	System.out.println("this is system directory::"+SystemUtils.USER_DIR);
	System.out.println("this is system language::"+SystemUtils.USER_LANGUAGE);
}
}
