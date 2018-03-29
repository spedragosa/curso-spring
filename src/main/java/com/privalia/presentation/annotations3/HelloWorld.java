package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Para usar la configuracion en la propia clase tengo que indicarle que es un componente
@Component(value = "helloWorld")
public class HelloWorld {

	private String hello;
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld() {
		
	}
	
	@Autowired
	public HelloWorld(@Value("Hello World from constructor") String hello) {
		this.hello = hello;
	}
}
