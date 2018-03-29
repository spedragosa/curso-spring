package com.privalia.entity.annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

public static void main(String[] args) {
		
		//Setter Injection
		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entity.annotations2");
		annotationContext.refresh();
		
		Student student = (Student)
				annotationContext.getBean(Student.class);
		
		System.out.println(student.toString());
		annotationContext.close();
	}
}
