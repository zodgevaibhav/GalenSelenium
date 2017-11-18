package com.framework.common;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverManager {
	
	protected static WebDriver CreateInstance(){
		WebDriver dr;
		//dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),getDerivedCapabilities());
		try {
			dr = new RemoteWebDriver(new URL(getDerivedHubUrl()),getDerivedCapabilities());
			return dr;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("******** Exception while creating remote webdriver instace, probably Hub URL is incorrect");
			System.out.println("******** Returning NULL webdriver object");
			e.printStackTrace();
			return null;
		}
		/*dr = new FirefoxDriver();
		dr.manage().window().setSize(new Dimension(450, 800));*/
		
	}
	
	private static DesiredCapabilities getDerivedCapabilities(){
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		if(System.getProperty("platform").contentEquals("web")){
			capabilities.setBrowserName(System.getProperty("browser"));
			capabilities.setVersion(System.getProperty("version"));
		}else if(System.getProperty("platform").contentEquals("mobile")){
			capabilities.setCapability("BROWSER_NAME", "Android");
			capabilities.setCapability("VERSION", "4.2.2");
			capabilities.setCapability("deviceName", "Emulator");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.android.chrome");
			capabilities.setCapability("appActivity", "com.android.chrome");
		}else{
			capabilities.setBrowserName("chrome");
			capabilities.setVersion("57");
		}
		return capabilities;		
	}

private static String getDerivedHubUrl(){
		String hubURL = null;
		if(System.getProperty("platform").contentEquals("web")){
			hubURL = System.getProperty("hubUrl");
		}else if(System.getProperty("platform").contentEquals("mobile")){
			hubURL = System.getProperty("appiumServerURL");
		}
		return hubURL;		
	}
}
