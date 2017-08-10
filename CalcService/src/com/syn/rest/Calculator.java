package com.syn.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class Calculator {

	 @RequestMapping(value = "/welcome/{a}/{b}/", method = RequestMethod.GET)
	    @ResponseBody
	    public int add(@PathVariable("a") int a,
	    		
	            @PathVariable("b") int b) {
	    	int c=a+b;
	        return c;
	    }
	 @RequestMapping(value = "/welcome/{a}/{b}/", method = RequestMethod.GET)
	    @ResponseBody
	    public int sub(@PathVariable("a") int a,
	    		
	            @PathVariable("b") int b) {
	    	int c=a-b;
	        return c;
	    }
	 
}
