package com.syn.hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
@SpringBootApplication

public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	/*RestTemplate restTemplate = new RestTemplate();
    	System.setProperty("proxyHost", "syn.ms.v3.com"); 
   	    System.setProperty("proxyPort", "9787");
    	String seconsServiceSresult=restTemplate.getForObject("http://syn.ms.v3.com:9787", String.class);*/
    	Manager manager=new Manager();
    	manager.myManager();
    	 
        return "Hello JeetySb--1  World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}