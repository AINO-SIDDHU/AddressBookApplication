package com.demo.action;

import java.util.ArrayList;

import com.demo.Address;
/**
 * 
 * @author adminpc12
 * @version 1.0 
 * @since  2020/02/20
 */
public class DisplayAddressAction implements Action {

	private ArrayList<Address> abook;
	int index;
	/**
	 * initialize the instance of DeleteAddressAction Class
	 * @param Book instance of Address 
	 */
	public DisplayAddressAction(ArrayList<Address> Book)
	{
		this.abook = Book;
	}
	/**
	 * overridden method from Action Interface 
	 * Display the all entries from AddressBook
	 */
	public void execute()
	{
		System.out.println(" Your Address Book ");
		System.out.printf("Street\tCity\tPincode\n");
		for(Address ad : abook)
		{
			ad.display();
		}
		
		System.out.println("------------------------------");
	}
	
}
