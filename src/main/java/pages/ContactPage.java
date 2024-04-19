package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
	}
	// Actions action = new Actions(driver);

	// Navigating to Contact Page
	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/a/i")
	public WebElement hoverOnMenu;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/a/span")
	public WebElement menuToContactPage;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[1]/span")
	public WebElement pageTitle;

	public void navigateToContactPage() {

		action = new Actions(driver);
		action.moveToElement(hoverOnMenu).perform();
		menuToContactPage.click();
		String contactPageTitle = pageTitle.getText();
		System.out.println(contactPageTitle);

	}

	// creating a new Contact
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	public WebElement createBtn;

	@FindBy(name = "first_name")
	public WebElement firstName;

	@FindBy(name = "last_name")
	public WebElement lastName;

	@FindBy(name = "middle_name")
	public WebElement middleName;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input")
	public WebElement searchTextbox;


	@FindBy(name = "identifier")
	public WebElement identifierTextbox;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	public WebElement saveBtn;

	public void createAContact() throws InterruptedException {

		createBtn.click();
		firstName.sendKeys("Rima");
		lastName.sendKeys("Das");
		middleName.sendKeys("JD");
		searchTextbox.click();
		searchTextbox.sendKeys("Salesforce");
		action.sendKeys(Keys.ENTER).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", identifierTextbox);
		identifierTextbox.sendKeys("Quality Engineer");
		Thread.sleep(2000);
		saveBtn.click();
	}

}
