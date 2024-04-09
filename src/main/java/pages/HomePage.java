package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath= "//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/div")
	public WebElement title;
	
	
	public void gettitle() {
		
		String titlename = title.getText();
		System.out.println(titlename);
		
	}

}
