package com.crm.testcases;

import org.testng.annotations.Test;

import com.crm.testBase.BaseTest;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest{
	
	@Test
	public void homePageTest() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp();
		
		HomePage home = new HomePage(driver);
		System.out.println("Navigating to homepage");
		log.info("Logged in successfully");
		Thread.sleep(2000);
	}

}
