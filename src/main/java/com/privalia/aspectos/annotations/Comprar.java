package com.privalia.aspectos.annotations;

import org.springframework.stereotype.Component;

import com.privalia.aspectos.ICompra;

@Component
public class Comprar implements ICompra{

	@Override
	public void compra(boolean error) throws Exception {
		// TODO Auto-generated method stub
		if(error){
			throw new Exception("Algo ha ido mal...");
		}
		System.out.println("Realizando la compra...");
	}

}
