package com.privalia.aspectos.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * VAmos a capturar la ejecución del bean compra
 * de modo que antes de que se ejecute el 
 * metodo compra() se compruebe la cantidad y despues de ejecue,
 */
@Aspect
public class ValidarMaterial {
	
	@Around("execution( * com.privalia.aspectos.Comprar.compra(..) )")
	
	@Before("execution( * com.privalia.aspectos.Comprar.compra(..) )")
	public void comprobarCantidad(){
		System.out.println("Se comprueba que es la cantidad correcta");
	}
	
	@AfterReturning("execution( * com.privalia.aspectos.Comprar.compra(..) )")
	public void empaquetar(){
		System.out.println("Se comprueba que es la cantidad correcta");
	}
	
	@AfterThrowing("execution( * com.privalia.aspectos.Comprar.compra(..) )")
	public void ponerReclamacion(){
		System.out.println("Se reclaman los defectos detectados");
	}

}

