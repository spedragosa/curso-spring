package com.privalia.entity.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Component(value="student")
@PropertySource("classpath:config.properties")
public class Student {

	@Autowired
	@Value("${student.idstudent}")
	private int idStudent;
	@Autowired
	@Value("${student.name}")
	private String name;
	
	@Autowired
	@Value("${student.surname}")
	private String surname;
	
	@Autowired
	@Value("${student.age}")
	private int age;

	@Autowired
	//SPEL: Spring (Usar qualifier para asociar clases ya sea 1-1 o 1-N)
	@Qualifier("address")
	//O Usar esto
	//@Value(#{address})
	private Address address;
	
	@Bean(name = "propertyConfig")
	public static PropertySourcesPlaceholderConfigurer propertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
