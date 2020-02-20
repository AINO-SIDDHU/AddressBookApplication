package com.demo;

import com.demo.action.Action;

public class MenuItem {

	private int choice;
	private String DisplayText;
	private Action action;
	private Menu parent;
	
	public MenuItem(String displayText) {
		setDisplayText(displayText);
	}

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

	public void setParent(Menu parent) {
		this.parent = parent;
	}

}
