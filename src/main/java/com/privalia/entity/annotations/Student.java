package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


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
	/**
	 * @return the idStudent
	 */
	public int getIdStudent() {
		return idStudent;
	}
	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * Empty Constructor
	 */
	public Student() {
		super();
	}
	/**
	 * @param idStudent
	 * @param name
	 * @param surname
	 * @param age
	 * @param address
	 */
	public Student(int idStudent, String name, String surname, int age, Address address) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", name=" + name + ", surname=" + surname + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	

}
