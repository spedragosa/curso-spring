package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfiguration {

	 @Bean(name = "compra")
	public Comprar comprar() {
		return new Comprar();
	}
	
	@Bean(name = "validarCompra")
	public ValidarMaterial address() {
		return new ValidarMaterial();
	}
}
