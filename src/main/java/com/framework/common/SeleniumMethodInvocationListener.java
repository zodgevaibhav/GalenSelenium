package com.framework.common;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class SeleniumMethodInvocationListener implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if(method.isTestMethod()){
			System.out.println("****** Requesting driver set from my listener");
			WebDriverFactory.setDriver();
		}		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		if(method.isTestMethod()){
			System.out.println("****** Requesting driver close from my listener");
			WebDriverFactory.closeDriver();
		}
		
	}

}
