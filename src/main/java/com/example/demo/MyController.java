package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	 @GetMapping("/")
	    public String sayHello() {
		  System.out.println("controller class");
		  
		  System.out.println("controller 2");
	        return "Hello,how are you!";
	    }
}
