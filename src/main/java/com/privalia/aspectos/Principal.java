package com.privalia.aspectos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		ICompra cp = (ICompra) context.getBean("compra");

		try{
			//Ejecución sin errores
			System.out.println("Invocamos sin problemas");
			cp.compra(false);
			
			//Provocamos el error
			System.out.println("Invocamos para que se produzca un error");
			cp.compra(true);
			
		} catch (Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}

		context.close();
	}
}
