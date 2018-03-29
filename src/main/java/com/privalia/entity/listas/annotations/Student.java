package com.privalia.entity.listas.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

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
public class Student {
	
	@Autowired
	@Value("1")
	private int idStudent;
	@Autowired
	@Value("David")
	private String name;
	@Autowired
	@Value("Soto")
	private String surname;
	@Autowired
	@Value("24")
	private int age;
	@Autowired
	@Qualifier("teachers")
	private List<Teacher> listTeacher;

}
