package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	 @GetMapping("/")
	    public String sayHello() {
		  System.out.println("controller class");
	        return "Hello,how are you!";
	    }
}
