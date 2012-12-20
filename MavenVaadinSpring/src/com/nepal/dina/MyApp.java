package com.nepal.dina;

import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

import com.vaadin.Application;


public class MyApp extends Application{

	
	private static final long serialVersionUID = 1L;

	public MyApp() {

		Window main = new Window("Hello window");
		setMainWindow(main);
		main.addComponent(new Label("Hello World!"));
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
