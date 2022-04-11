package KitePOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPOMKite 
{
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
	
	public PinPOMKite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String pn)
	{
		pin.sendKeys(pn);
	}
	
	public void clickOnContinueButton() 
	{
		continueButton.click();
	}
	
}
