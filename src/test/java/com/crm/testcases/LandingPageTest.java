package com.crm.testcases;

import org.testng.annotations.Test;

import com.crm.testBase.BaseTest;

import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class LandingPageTest extends BaseTest{
	
	@Test
	public void landingPage() throws InterruptedException {
		
		LandingPage landing = new LandingPage(driver);
		landing.navigateToAbout();
		Thread.sleep(2000);
		landing.navigateToAutomotiveCRMFromCRM();
		Thread.sleep(2000);
		
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp();
		log.info("Logged in successfully");
		
		HomePage home = new HomePage(driver);
		System.out.println("Navigating to homepage");
		log.info("Logged in successfully");
		Thread.sleep(2000);
		
	}

}
