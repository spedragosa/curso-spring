package com.privalia.entity.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
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
@Component(value="address")
@PropertySource("classpath:config.properties")
public class Address {
	
	@Autowired
	@Value("${address.idAddress}")
	private int id;
	
	@Autowired
	@Value("${address.street}")
	private String street;

}
