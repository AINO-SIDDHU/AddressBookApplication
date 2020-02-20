package com.demo;

import java.util.ArrayList;

import com.demo.action.Action;
import com.demo.action.DeleteAddressAction;
import com.demo.action.DisplayAddressAction;
import com.demo.action.DisplayMenuAction;
import com.demo.action.EnterAddressAction;
import com.demo.action.FindAddressAction;
import com.demo.action.SaveBookAction;

public class ApplicationBook {
	
	ArrayList<Address> Book = new ArrayList<Address>();
	public void run() {
		
		
		Menu mobj = new Menu("Address Book Application");
		
		mobj.addMenuItem(1, "Enter Address", new EnterAddressAction(Book));
		mobj.addMenuItem(2, "Delete Address",new DeleteAddressAction(Book));
		mobj.addMenuItem(3, "Display Book", new DisplayAddressAction(Book));
		
		Menu findAddress = new Menu("Find Address");
		findAddress.addMenuItem(1, "By Street", new FindAddressAction(Book,"Street"));
		findAddress.addMenuItem(2, "By City", new FindAddressAction(Book,"City"));
		findAddress.addMenuItem(3, "By Pincode", new FindAddressAction(Book,"Pincode"));
		mobj.addMenuItem(4, findAddress,new DisplayMenuAction(findAddress));
		
		new DisplayMenuAction(mobj).execute();

	}

	public static void main(String[] args) {
		
		ApplicationBook Abook = new ApplicationBook();
		Abook.run();
	}

}

