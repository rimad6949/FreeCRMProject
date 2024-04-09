package com.crm.testBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	//We are not mentioning the driver as "static" because we want the browser to quit that after each testcase 
	public WebDriver driver;
	public Properties config = new Properties();
	public FileInputStream fis;
	public Logger log = LogManager.getLogger(BaseTest.class.getName());


	@BeforeMethod
	public void setUp() {
		
		if(driver == null) {
			
			try {
				fis = new FileInputStream("/Users/rimadas/eclipse-workspace/SeleniumProjectCRM/src/test/resources/com/crm/properties/config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(config.getProperty("browser").equals("chrome")) {
				
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_setting_values.notifications", 2);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				ChromeOptions opts = new ChromeOptions();
				opts.setExperimentalOption("prefs", prefs);
				opts.addArguments("--disable-extensions");
				opts.addArguments("--disable-infobars");
				opts.addArguments("--incognito");
				
				driver = new ChromeDriver(opts);
				log.info("Chrome browser launched");
			}
			else if(config.getProperty("browser").equals("firefox")) {
				
				driver = new FirefoxDriver();
				log.info("Firefox browser launched");
			}
			
			driver.get(config.getProperty("testsiteUrl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			
		}

			
	}
	

	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.quit();	
		}
		

	}


}
