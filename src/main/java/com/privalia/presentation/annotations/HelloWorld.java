package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {
	
	@Autowired
	@Value("Hello World Form Annotations!")
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
}
