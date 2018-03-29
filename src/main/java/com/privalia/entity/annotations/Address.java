package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Autowired
	@Value("${address.idAddress}")
	private int idAddress;
	@Autowired
	@Value("${address.street}")
	private String street;
	/**
	 * @return the idAddress
	 */
	public int getIdAddress() {
		return idAddress;
	}
	/**
	 * @param idAddress the idAddress to set
	 */
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * Empty Constructor
	 */
	public Address() {
		super();
	}
	/**
	 * @param idAddress
	 * @param street
	 */
	public Address(int idAddress, String street) {
		super();
		this.idAddress = idAddress;
		this.street = street;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [idAddress=" + idAddress + ", street=" + street + "]";
	}
	
	
}
