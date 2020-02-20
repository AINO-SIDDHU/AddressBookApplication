package com.demo.action;

import java.util.*;

import com.demo.Address;

public class EnterAddressAction implements Action {

	private ArrayList<Address> abook;

	Scanner sobj = new Scanner(System.in);

	public EnterAddressAction(ArrayList<Address> Book) {
		abook = Book;
	}

	@Override
	public void execute() {

		System.out.println("Enter Street Address :");
		String street = sobj.next();
		
		System.out.println("Enter City Address :");
		String city = sobj.next();
		
		System.out.println("Enter Pincode Addrees :");
		int pin = sobj.nextInt();
		
		Address ad = new Address(street, city, pin);

		abook.add(ad);
		
		System.out.println("Address Book Added Succesfully !");
		System.out.println("----------------------------------------");
	}

}
