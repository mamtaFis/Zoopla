package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;

public class homePage extends base{
	
	@FindBy(xpath="//*[@name='q']")
	public WebElement searchInputField;
	
	@FindBy(id="search-submit")
	public WebElement searchBtn;
	
	public void searchProperty() throws InterruptedException
	{
		searchInputField.sendKeys("london");
		Thread.sleep(3000);
		searchBtn.click();
	}
	
	
	public homePage()
	{
		PageFactory.initElements(driver, this);
		//this.driver1=driver;
	}
}
