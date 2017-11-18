package com.test.pages;

import org.openqa.selenium.support.ui.LoadableComponent;

import com.framework.common.WebDriverFactory;

public class LoginPage extends LoadableComponent<LoginPage>{
	@Override
	protected void isLoaded() throws Error {	
	}
	
	@Override
	public void load() {
		WebDriverFactory.getDriver().get("http://testapp.galenframework.com/");		
	}

	public String getTitle() {
		try{
		return WebDriverFactory.getDriver().getTitle();
		}catch(Exception e){
			return "Vaibhav";
		}	
	}
}