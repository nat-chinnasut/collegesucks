package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class myAccountLoginPage {

	public myAccountLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="username")
	public WebElement usernameField;
	
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	
	@FindBy(xpath="//*[@id='customer_login']/div[1]/form/p[3]/input[3]")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@id='page-36']/div/div[1]/div/p[1]/a")
	public WebElement signOutButton;
	
	@FindBy(xpath="//ul[@class='woocommerce-error']")
	public WebElement errorNoficationTextBox;
}
