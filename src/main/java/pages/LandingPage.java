package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class LandingPage extends BasePage{

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	//Landing Page 
	@FindBy(className="brand-name")
	public WebElement brandName;
	
	//About Page
	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/li[2]/a")
	public WebElement aboutFreeCRMLink;
		
	@FindBy(xpath = "/html/body/div[1]/main/section[2]/div/div/div[1]/h3")
	public WebElement titleOfThePage;
	
	public void navigateToAbout() {
		
		aboutFreeCRMLink.click();
		String titleOfAboutPage = titleOfThePage.getText();
		System.out.println(titleOfAboutPage);
		brandName.click();
		
	}	
	
	//Comman Elements for CRM List
	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/li[3]/a")
	public WebElement howerOverCRMLink;
	
	Actions action = new Actions(driver);
	
	//CRM For Any Business
	@FindBy(xpath = "//a[@href='crmcloud.html']")
	public WebElement clickOnCRMForAnyBussiness;
	
	@FindBy(xpath="/html/body/div[1]/main/section[1]/div/h1")
	public WebElement titleOfCRMForAnyBussinessPage;
	
	public void navigateToCRMForAnyBussiness() {
		
		action = new Actions(driver);	
		action.moveToElement(howerOverCRMLink).perform();
		clickOnCRMForAnyBussiness.click();
		String titleOfCRMForAnyBussinessPage = automotivePageTitle.getText();
		System.out.println(titleOfCRMForAnyBussinessPage);
	}
	
	//AutomotiveCRM 
	@FindBy(xpath = "//a[@href='auto.html']")
	public WebElement clickOnAutomotiveCRMLink;
	
	@FindBy(xpath = "/html/body/div[1]/main/section[1]/div/h1")
	public WebElement automotivePageTitle;
	
	public LoginPage navigateToAutomotiveCRMFromCRM() {
		
		action = new Actions(driver);
		action.moveToElement(howerOverCRMLink).perform();
		clickOnAutomotiveCRMLink.click();
		String titleOfAutomotivPage = automotivePageTitle.getText();
		System.out.println(titleOfAutomotivPage);
		brandName.click();
		return new LoginPage(driver);	
		
	}
	

}
