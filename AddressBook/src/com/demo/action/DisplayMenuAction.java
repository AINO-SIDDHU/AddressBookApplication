package com.demo.action;

import com.demo.Menu;

public class DisplayMenuAction implements Action {
	
	private Menu menu;
	public DisplayMenuAction(Menu menu) {
		this.menu = menu;
	}

	@Override
	public void execute() {
		menu.display();
	}

}
