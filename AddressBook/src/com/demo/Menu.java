package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.action.Action;

public class Menu extends MenuItem {

	public Menu(String displayText) {
		super(displayText);
	}


	private ArrayList<MenuItem> item = new ArrayList<MenuItem>();

	Scanner sobj = new Scanner(System.in);

	public void addMenuItem(int choice, String menu, Action act) {
		MenuItem mi = new MenuItem(choice, menu, act);
		item.add(mi);
		mi.setParent(this);

	}

	public void addMenuItem(int choice, Menu menu, Action act) {
		menu.setChoice(choice);
		menu.setAction(act);
		item.add(menu);
		menu.setParent(this);

	}


	public void display() {
		while (true) {
			System.out.println(getDisplayText());
			System.out.println("==============================================================================");

			for (MenuItem m : item) {
				if(m instanceof Menu) {
					((Menu)m).displayAsMenuItem();
				}else {
					m.display();
				}
			}
			System.out.println("Enter your choice:");

			int choice = sobj.nextInt();

			for (MenuItem m : item) {
				if (m.isSelected(choice))
					break;

			}
		}
	}

	public void displayAsMenuItem()
	{
		System.out.println(getChoice() + " : " + getDisplayText());
	}
}
