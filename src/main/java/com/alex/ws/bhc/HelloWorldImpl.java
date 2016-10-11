package com.alex.ws.bhc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.alex.ws.bhc.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {		
		return "Hello " + text;
	}
	
	public int sum(int num1, int num2) {		
		return num1 + num2;
	}
}
