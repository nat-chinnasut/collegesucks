package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.commonMethods;

public class commonPage  {
	
	
	
	
	
	public commonPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//*[@id='menu-item-50']")
	public WebElement myAccountTab;
	
		
	
	
	
	
	

}
