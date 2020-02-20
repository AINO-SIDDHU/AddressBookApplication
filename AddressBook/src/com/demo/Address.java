package com.demo;

public class Address {

	private String street, city;
	private int pinCode;

	public Address(String street, String city, int pinCode) {

		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}

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

	public void display() {

		System.out.printf("\t |" + street + "|\t |" + city + "|\t|" + pinCode + "|\n");
	}

	public boolean isMatchStreet(String str) {
		return this.street.contains(str);
	}

	public boolean isMatchCity(String str) {
		return this.city.contains(str);
	}

	public boolean isMatchPincode(int pincode) {
		return (this.pinCode == pincode);
	}

}
