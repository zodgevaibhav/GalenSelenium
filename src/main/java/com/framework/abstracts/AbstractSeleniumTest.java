package com.framework.abstracts;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.framework.common.SeleniumMethodInvocationListener;
import com.framework.common.TestDataProvider;
import com.framework.common.WebDriverFactory;
import com.framework.common.WebDriverManager;
import com.galenframework.testng.GalenTestNgReportsListener;
import com.galenframework.testng.GalenTestNgTestBase;

@Listeners(SeleniumMethodInvocationListener.class)
public class AbstractSeleniumTest extends GalenTestNgTestBase {
	@DataProvider(name = "ExcelAPIDataProvider")
	public String[][] DataProvider(Method m) {
		return TestDataProvider.GetExcelDataProvider(m);
		//return TestDataProvider.GetExcelDataProvider(m);
	}

	@Override
	public WebDriver createDriver(Object[] args) {
		// TODO Auto-generated method stub
		return WebDriverFactory.getDriver();
	}
	
	

}
