package Day13;

import org.testng.annotations.Test;

import Pages.commonPage;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.Driver;
import utilities.ListernersTestNG;
import utilities.PropertiesReader;
import utilities.commonMethods;

@Listeners(ListernersTestNG.class)
public class myAccountLogin extends commonMethods {

	@BeforeMethod
	public void beforeTest() {
//		1) Open the browser
//		2) Enter the URL “http://practice.automationtesting.in/”
		Driver.getDriver();
	}

	@Test(enabled = false)
	public void LoginWithValidUsernamePassword() {

//	3) Click on My Account Menu
		cp.myAccountTab.click();

//	4) Enter registered username in username textbox	
//	5) Enter password in password textbox
		myAPage.usernameField.sendKeys(PropertiesReader.getProperty("automationUsername"));
		myAPage.passwordField.sendKeys(PropertiesReader.getProperty("automationPassword"));

//	6) Click on login button
		myAPage.loginButton.click();
//	7) User must successfully login to the web page	
		myAPage.signOutButton.click();
	}

	@Test(enabled = false)
	public void LoginWithInvalidUsernameInvalidPassword() {

//		3) Click on My Account Menu
		cp.myAccountTab.click();
//		4) Enter invalid username in username textbox	
//		5) Enter invalid password in password textbox
		myAPage.usernameField.sendKeys(PropertiesReader.getProperty("invalidUserName"));
		myAPage.passwordField.sendKeys(PropertiesReader.getProperty("invalidPassword"));

//		6) Click on login button
		myAPage.loginButton.click();

//		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
		Assert.assertEquals(myALoginPage.errorNoficationTextBox.getText(),PropertiesReader.getProperty("errorUserCouldNotbeFound"));
		

	
	}

	@Test(enabled = true)
	public void LoginWithValidUsernameEmptyPassword() {

//		3) Click on My Account Menu
		cp.myAccountTab.click();
//		4) Enter registered username in username textbox	
//		5) Enter empty password in password textbox
		myAPage.usernameField.sendKeys(PropertiesReader.getProperty("automationUsername"));
		myAPage.passwordField.sendKeys("");

//		6) Click on login button
		myAPage.loginButton.click();

//		7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
		Assert.assertEquals(myALoginPage.errorNoficationTextBox.getText(),PropertiesReader.getProperty("errorInvalidPassword"));

	}

}
