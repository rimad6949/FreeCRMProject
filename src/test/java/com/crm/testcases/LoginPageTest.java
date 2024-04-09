package com.crm.testcases;

import org.testng.annotations.Test;

import com.crm.testBase.BaseTest;

import pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test
	public void loginPageTest() throws InterruptedException {
		System.out.println("Clicking on Login btn");
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp();
		log.info("Logged in successfully");
		Thread.sleep(2000);
		
		

	}

}
