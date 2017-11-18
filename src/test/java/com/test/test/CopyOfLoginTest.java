package com.test.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.abstracts.AbstractSeleniumTest;
import com.test.pages.LoginPage;

import static java.util.Arrays.asList;
public class CopyOfLoginTest extends AbstractSeleniumTest{
	@Test
	public void LoginByValidUser2_CopyOfLogin (){
		String bl = "Vaibhav";
		LoginPage loginPage = new LoginPage();
		loginPage.load();
		// bl = loginPage.getTitle();
				
			try {
				System.out.println("**************** before opening file");
			//	load("/");
				System.out.println("**************** load root");
				//checkLayout("/GalenWithSelenium/spec/common.spec", asList("mobile"));
				checkLayout("f:\\git\\GalenWithSelenium\\spec\\common.spec", asList("mobile"));
				//checkLayout("F:\\workspace\\GalenWithSelenium\\spec\\loginPage.spec", asList("mobile"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("**************** Exception while opening file");
				e.printStackTrace();
			}
		if(bl.contentEquals("Google")){
			System.out.println("Test Case PASS");
		}else{
			System.out.println("Test Case Fail");
		}
		
		Assert.assertEquals(bl, "Google");
	}
	
	
	
	@Test
	public void LoginByValidUser1_CopyOfLogin(){
		String bl = "Vaibhav";
		LoginPage loginPage = new LoginPage();
		loginPage.load();
		// bl = loginPage.getTitle();
			
			try {
				System.out.println("**************** before opening file");
			//	load("/");
				System.out.println("**************** load root");
				//checkLayout("/GalenWithSelenium/spec/common.spec", asList("mobile"));
	//			checkLayout("F:\\workspace\\GalenWithSelenium\\spec\\common.spec", asList("mobile"));
				checkLayout("f:\\git\\GalenWithSelenium\\spec\\loginPage.spec", asList("mobile"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("**************** Exception while opening file");
				e.printStackTrace();
			}
	/*	if(bl.contentEquals("Google")){
			System.out.println("Test Case PASS");
		}else{
			System.out.println("Test Case Fail");
		}
		
		Assert.assertEquals(bl, "Google");*/
	}
	
	
	
	
	
	/*
	//@Test//(dataProvider="ExcelAPIDataProvider")
	public void LoginByInValidUser (){
		String bl = "Vaibhav";
		LoginPage loginPage = new LoginPage();
		loginPage.load();
		 bl = loginPage.getTitle();
		if(bl.contentEquals("Vaibhav")){
			System.out.println("Test Case PASS");
		}else{
			System.out.println("Test Case Fail");
		}
		Assert.assertEquals(bl, "Vaibhav");
	}*/

}
