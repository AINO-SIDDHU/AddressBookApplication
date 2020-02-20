package com.demo.action;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.Address;
import com.demo.Menu;
import com.demo.MenuItem;

public class FindAddressAction implements Action {

	private ArrayList<Address> abook;
	private String findBy;
	Scanner sobj = new Scanner(System.in);
	private Menu Menu;

	public FindAddressAction(ArrayList<Address> Book, String by) {
		this.abook = Book;
		this.findBy = by;
	}

	public void execute() {

		switch (findBy) {
		case "Street":
			findByStreet();
			break;
		case "City":
			findByCity();
			break;
		case "Pincode":
			findByPincode();
			break;
		case "Back":
			goBack();
			break;
		default:
			break;
		}
	}

	private void goBack() {
	}

	private void findByPincode() {
		System.out.println("Enter pincode to serach:");
		int pincode = sobj.nextInt();

		for (Address ad : abook) {
			if (ad.isMatchPincode(pincode)) {
				ad.display();
			}
		}

	}

	public void findByStreet() {
		System.out.println("Enter street to search :");
		String str = sobj.nextLine();

		for (Address ad : abook) {
			if (ad.isMatchStreet(str)) {
				ad.display();
			}
		}
	}

	public void findByCity() {
		System.out.println("Enter City to search :");
		String str = sobj.nextLine();

		for (Address ad : abook) {
			if (ad.isMatchCity(str)) {
				ad.display();
			}
		}

	}
}
