package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.privalia.entity.annotations.SpringConfiguration;

@EnableAspectJAutoProxy
public class Principal {

	public static void main(String[] args) {

		// Setter Injection
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);

		context.scan("com.privalia.aspectos.annotations");
	    //context.refresh();
		
		Comprar compra = (Comprar) context.getBean(Comprar.class);

		try {
			// Ejecución sin errores
			System.out.println("Invocamos sin problemas");
			compra.compra(false);

			// Provocamos el error
			System.out.println("Invocamos para que se produzca un error");
			compra.compra(true);

		} catch (Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}

		context.close();
	}
}
