package kiteUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	//step1 declare private variables 
		@FindBy(id = "pin") private WebElement pinEnter;
		@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;

		//step2 declare constructor
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String realPin) 
	{
		pinEnter.sendKeys(realPin);
	}
	
	public void clickOnContinueButton() throws InterruptedException
	{
		continueButton.click();
		Thread.sleep(500);
	}
}

