package com.crm.testcases;

import org.testng.annotations.Test;

import com.crm.testBase.BaseTest;

import pages.LandingPage;

public class LandingPageTest extends BaseTest{
	
	@Test
	public void landingPage() throws InterruptedException {
		
		LandingPage landing = new LandingPage(driver);
		landing.navigateToAbout();
		Thread.sleep(2000);
		landing.navigateToAutomotiveCRMFromCRM();
		Thread.sleep(2000);
		
	}

}
