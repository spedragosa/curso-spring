package com.privalia.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.privalia.presentation.annotations.HelloWorld;

public class Principal {
	public static void main(String[] args) {
		//Setter Injection
		AbstractApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		HelloWorld helloWorld = (HelloWorld)
				appContext.getBean("helloWorld");
		
		System.out.println(helloWorld.getHello());
		
		//Constructor Injection
		/*HelloWorld helloWorldConst = (HelloWorld)
				appContext.getBean("helloWorldConst");

		System.out.println(helloWorldConst.getHello());*/
		
		appContext.close();
	}
}
