package com.privalia.entity.listas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Principal {

public static void main(String[] args) {
		
		//Setter Injection
		AbstractApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student student = (Student)
				appContext.getBean(Student.class);
		
		System.out.println(student.toString());
		appContext.close();
	}
}
