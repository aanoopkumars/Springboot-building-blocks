package com.ucan.restservices;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/hw")
	@GetMapping("/hw")
	public String helloWorld() {
		return "Hello buddy, hw r u?";
	}
	
	@GetMapping("/getu")
	public UserDetails getUser() {
		return new UserDetails("Bijoy", "Varghese", "Londonk");
	}
}
