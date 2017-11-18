package com.test.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.abstracts.AbstractSeleniumTest;
import com.test.pages.LoginPage;

import static java.util.Arrays.asList;

public class LoginTest extends AbstractSeleniumTest {

	@Test
	public void LoginByValidUser2_LoginTest() {
		LoginPage loginPage = new LoginPage();
		loginPage.load();
		try {
			checkLayout("f:\\git\\GalenWithSelenium\\spec\\common.spec",
					asList("mobile"));
		} catch (IOException e) {
			System.out.println("**************** Exception while opening file");
			e.printStackTrace();
		}
	}

	@Test
	public void LoginByValidUser_LoginTest() {
		LoginPage loginPage = new LoginPage();
		loginPage.load();

		try {
			checkLayout("f:\\git\\GalenWithSelenium\\spec\\loginPage.spec",
					asList("mobile"));
		} catch (IOException e) {
			System.out.println("**************** Exception while opening file");
			e.printStackTrace();
		}
	}
}
