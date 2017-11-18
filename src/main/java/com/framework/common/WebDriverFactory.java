package com.framework.common;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver(){
		if(webDriver.get()==null){
			System.out.println("***** setting driver as it found null, probably galen lisner call");
			setDriver();
		}
		return webDriver.get();		
	}
	public static void setDriver() {
		if(webDriver.get()==null){
		System.out.println("******* Setting driver object");
		webDriver.set(WebDriverManager.CreateInstance());
		}else{
			System.out.println("***** Did not set driver as it is not null");
		}
	}
	
	public static void closeDriver(){
		webDriver.get().quit();
		webDriver.set(null);
		
	}
}
