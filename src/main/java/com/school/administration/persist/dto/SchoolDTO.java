package com.school.administration.persist.dto;

import java.io.Serializable;

/**
 * @author Jhonatas Oliveira
 *
 */
public class SchoolDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private String address;

	private String phone;

	/**
	 * @param name
	 * @param address
	 * @param phone
	 */
	public SchoolDTO(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SchoolDTO [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}
