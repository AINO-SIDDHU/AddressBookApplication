package com.demo.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.Address;

public class DeleteAddressAction implements Action {

	private ArrayList<Address> abook;
	private int index;
	
	public DeleteAddressAction(ArrayList<Address> Book)
	{
		this.abook = Book;
	}
	
	Scanner sobj = new Scanner(System.in);
	
	public void execute()
	{
		System.out.println("Enter index to delete the Address Book :");
		
		index = sobj.nextInt();
		
		abook.remove(index);
		
		System.out.println("Address Book Deleted Successfully !");
		System.out.println("---------------------------------------------");
	}
	
	
}
