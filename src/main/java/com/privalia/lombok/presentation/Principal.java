package com.privalia.lombok.presentation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.privalia.lombok.presentation.HelloWorld;

public class Principal {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
		context.close();
	}
}
