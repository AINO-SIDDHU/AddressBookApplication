package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.action.Action;
/**
 * 
 * @author adminpc12
 * @version 1.0 
 * @since  2020/02/20
 */
public class Menu extends MenuItem {

	public Menu(String displayText) {
		super(displayText);
	}

/**
 * ArrayList to store MenuItems
 */
	private ArrayList<MenuItem> item = new ArrayList<MenuItem>();

	Scanner sobj = new Scanner(System.in);
/**
 * Adds the menuItems to ArrayList Object (item)
 * @param choice parameter to select choice of MenuItems 
 * @param menu parameter to addMenuItem for nested MenuItem
 * @param act Action instance as a Parameter to addItem 
 */
	public void addMenuItem(int choice, String menu, Action act) {
		MenuItem mi = new MenuItem(choice, menu, act);
		item.add(mi);
		mi.setParent(this);

	}
/**
 * Overrided method of above addItem 
 * @param choice parameter to select choice of MenuItems 
 * @param menu parameter to addMenuItem for nested MenuItem
 * @param act Action instance as a Parameter to addItem 
 
 */
	public void addMenuItem(int choice, Menu menu, Action act) {
		menu.setChoice(choice);
		menu.setAction(act);
		item.add(menu);
		menu.setParent(this);

	}

//Used to display title of Menu and Checks the MenuItem is the instance of Menu then Display the MenuItem
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
/**
 * 
 */
	public void displayAsMenuItem()
	{
		System.out.println(getChoice() + " : " + getDisplayText());
	}
}
