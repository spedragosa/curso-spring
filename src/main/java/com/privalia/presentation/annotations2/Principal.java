package com.privalia.presentation.annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.privalia.presentation.annotations2.HelloWorld;

public class Principal {
	
	public static void main(String[] args) {
	
	//Setter Injection
			AnnotationConfigApplicationContext annotationContext = 
					new AnnotationConfigApplicationContext();
			
			annotationContext.scan("com.privalia.presentation.annotations2");
			annotationContext.refresh();

			
			HelloWorld helloWorld = annotationContext.getBean(HelloWorld.class);
			System.out.println(helloWorld.getHello());
			
			HelloWorld helloWorld1 = (HelloWorld)
					annotationContext.getBean("helloWorld");
			System.out.println(helloWorld1.getHello());
			
			annotationContext.close();
}
}
