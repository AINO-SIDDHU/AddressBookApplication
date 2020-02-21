package com.demo;
/**
 * 
 * @author adminpc12
 * @version 1.0 
 * @since  2020/02/20
 */
public class Address {

	private String street, city;
	private int pinCode;
/**
 * 
 * @param street initializes the value of street in the address book
 * @param city initializes the value of City in the address book
 * @param pinCode initializes the value of pinCode in the address book
 */
	public Address(String street, String city, int pinCode) {

		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
/**
 * 
 * @return return Street
 */
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
/**
 * displays the address
 */
	public void display() {

		System.out.printf("\t |" + street + "|\t |" + city + "|\t|" + pinCode + "|\n");
	}
/**
 * 
 * @param str accept string as street
 * @return true if given string is match with existed one
 */
	public boolean isMatchStreet(String str) {
		return this.street.contains(str);
	}
/**
 * 
 * @param str accept string as City
 * @return true if given string is match with existed one
 */
	public boolean isMatchCity(String str) {
		return this.city.contains(str);
	}
/**
 * 
 * @param pincode accept integer as pinCode
 * @return true if given integer is match with existed one
 */
	public boolean isMatchPincode(int pincode) {
		return (this.pinCode == pincode);
	}

}
