package com.demo;

import com.demo.action.Action;
/**
 * 
 * @author adminpc12
 * @version 1.0 
 * @since  2020/02/20
 */
public class MenuItem {
/**
 * 
 */
	private int choice;
	private String DisplayText;
	private Action action;
	private Menu parent;
	/**
	 *  Constructor used to initialize title 
	 * @param displayText String is to title text of MenuItem
	 */
	public MenuItem(String displayText) {
		setDisplayText(displayText);
	}
/**
 * Constrocter to initialize the MenuItem
 * @param choice parameter to select choice of MenuItems 
 * @param displayText text of MenuItems 
 * @param act Instance  of Action and it takes us to selected Action 
 */
	public MenuItem(int choice, String displayText,Action act) {
		super();
		this.choice = choice;
		this.DisplayText = displayText;
		this.action = act;
	}

	public MenuItem(int choice2, String menu) {
		this.choice = choice2;
		this.DisplayText = menu;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public String getDisplayText() {
		return DisplayText;
	}

	public void setDisplayText(String displayText) {
		DisplayText = displayText;
	}

	public void display() {
		System.out.println(choice + " : " + DisplayText);

	}
/**
 * Used to Check whether the given option and MenuItem Choice is matched or not ?
 * @param option  option give by user
 * @return returns true if matched and vice versa
 */
	public boolean isSelected(int option) {
		
		if(option == choice)
		{
			action.execute();
			return true;
		}
		else return false;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Menu getParent() {
		return parent;
	}
/**
 * set the parent to Menu Class  
 * @param parent instance of Menu as parameter
 */
	public void setParent(Menu parent) {
		this.parent = parent;
	}

}
