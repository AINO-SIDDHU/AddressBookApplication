package com.demo.action;

import java.util.*;

import com.demo.Address;
/**
 * 
 * @author adminpc12
 * @version 1.0 
 * @since  2020/02/20
 */
public class EnterAddressAction implements Action {

	private ArrayList<Address> abook;

	Scanner sobj = new Scanner(System.in);
	/**
	 * initialize the instance of EnterAddressAction Class
	 * @param Book instance of Address 
	 */

	public EnterAddressAction(ArrayList<Address> Book) {
		abook = Book;
	}

	/**
	 * overridden method from Action Interface 
	 *  Adds the entries which are given by user
	 */
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
