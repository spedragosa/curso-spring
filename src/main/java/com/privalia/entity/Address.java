package com.privalia.entity;



public class Address {
	
	private int idAddress;
	private String street;
	
	/**
	 * @return the idAddres
	 */
	public int getIdAddress() {
		return idAddress;
	}

	/**
	 * @param idAddres the idAddres to set
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
	 * @param idAddres
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
		return "Address [idAddress=" + idAddress + ", street=" + street + ", getIdAddress()=" + getIdAddress()
				+ ", getStreet()=" + getStreet() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
