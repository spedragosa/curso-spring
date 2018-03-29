package com.privalia.lombok.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class HelloWorld {

	@Autowired
	@Value("Hello World From Annotations!")
	@Getter
	@Setter
	private String hello;

}