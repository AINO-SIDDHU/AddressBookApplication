package com.demo.action;

import java.util.ArrayList;

import com.demo.Address;

public class DisplayAddressAction implements Action {

	private ArrayList<Address> abook;
	int index;
	public DisplayAddressAction(ArrayList<Address> Book)
	{
		this.abook = Book;
	}
	
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
