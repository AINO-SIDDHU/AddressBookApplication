package com.demo.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.Address;
/**
 * 
 * @author adminpc12
 * @version 1.0 
 * @since  2020/02/20
 */
public class DeleteAddressAction implements Action {
//delete the whole address save into AddressBook
	private ArrayList<Address> abook;
	private int index;
	/**
	 * initialize the instance of DeleteAddressAction Class
	 * @param Book instance of Address 
	 */
	public DeleteAddressAction(ArrayList<Address> Book)
	{
		this.abook = Book;
	}
	
	Scanner sobj = new Scanner(System.in);
	/**
	 * overridden method from Action Interface 
	 * delete the all entries from AddressBook
	 */
	public void execute()
	{
		System.out.println("Enter index to delete the Address Book :");
		
		index = sobj.nextInt();
		
		abook.remove(index);
		
		System.out.println("Address Book Deleted Successfully !");
		System.out.println("---------------------------------------------");
	}
	
	
}
