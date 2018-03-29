package com.privalia.entity.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * Cargamos las propiedades al contexto.
 */
@PropertySource("classpath:config.properties")
@Configuration
public class SpringConfiguration {
	
	@Bean(name = "studentCons")
	public Student student() {
		return new Student();
	}
	
	@Bean(name = "address")
	public Address address() {
		return new Address();
	}

}
