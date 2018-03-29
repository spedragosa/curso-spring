package com.privalia.aspectos;

/*
 * VAmos a capturar la ejecución del bean compra
 * de modo que antes de que se ejecute el 
 * metodo compra() se compruebe la cantidad y despues de ejecue,
 */
public class ValidarMaterial {
	
	public void comprobarCantidad(){
		System.out.println("Se comprueba que es la cantidad correcta");
	}
	
	public void empaquetar(){
		System.out.println("Se comprueba que es la cantidad correcta");
	}
	
	public void ponerReclamacion(){
		System.out.println("Se reclaman los defectos detectados");
	}

}
