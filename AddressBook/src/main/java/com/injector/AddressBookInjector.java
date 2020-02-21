package com.injector;

import com.demo.action.Action;
import com.demo.action.FindAddressAction;
import com.google.inject.AbstractModule;

public class AddressBookInjector extends AbstractModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
	bind(Action.class).to(FindAddressAction.class);
	}
	

}
