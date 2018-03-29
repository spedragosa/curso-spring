package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.privalia.aspectos.ICompra;
import com.privalia.entity.annotations.SpringConfiguration;

public class Principal {

	public static void main(String[] args) {

		// Setter Injection
		AbstractApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ICompra cp = (ICompra) appContext.getBean(Comprar.class);

		try {
			// Ejecución sin errores
			System.out.println("Invocamos sin problemas");
			cp.compra(false);

			// Provocamos el error
			System.out.println("Invocamos para que se produzca un error");
			cp.compra(true);

		} catch (Exception e) {
			System.out.println("Obtenemos la excepción " + e);
		}

		appContext.close();
	}
}
