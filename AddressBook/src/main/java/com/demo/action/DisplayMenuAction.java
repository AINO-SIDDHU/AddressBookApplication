package com.demo.action;

import com.demo.Menu;
/**
 * 
 * @author adminpc12
 * @version 1.0 
 * @since  2020/02/20
 */
public class DisplayMenuAction implements Action {
	
	private Menu menu;
	/**
	 * Constructor to initialize DisplayMenuAction Class
	 * @param menu Instance of Menu Class as parameter
	 */
	public DisplayMenuAction(Menu menu) {
		this.menu = menu;
	}

	/**
	 * overridden method from Action Interface 
	 * displays the menu or Sub menu
	 */
	public void execute() {
		menu.display();
	}

}
