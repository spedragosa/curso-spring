package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Principal {

	public static void main(String[] args) {
		
		//Setter Injection
		AbstractApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student studentCons = (Student)
				appContext.getBean(Student.class);
		
		System.out.println(studentCons.toString());
		appContext.close();
	}
}
