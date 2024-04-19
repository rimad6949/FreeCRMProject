package com.crm.testcases;

import org.testng.annotations.Test;

import com.crm.testBase.BaseTest;

import pages.ContactPage;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class CRMTestcases extends BaseTest{
	
	@Test
	public void crmTestcases() throws InterruptedException {
		
		LandingPage landing = new LandingPage(driver);
		Thread.sleep(2000);
		landing.navigateToAbout();
		Thread.sleep(2000);
		landing.navigateToAutomotiveCRMFromCRM();
		Thread.sleep(2000);
		
		LoginPage login = new LoginPage(driver);
		login.loginIntoApp();
		log.info("Logged in successfully");
		
		HomePage home = new HomePage(driver);
		System.out.println("Navigating to homepage");
		home.gettitle();
		log.info("Logged in successfully");
		Thread.sleep(2000);
		
		ContactPage contact = new ContactPage(driver);
		System.out.println("Navigating to contact page");
		contact.navigateToContactPage();
		contact.createAContact();
		
	}

}
