package Day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonAutomationPracrice {

	
	
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}
	
	@After
	public void afterTest() {
		driver.close();
	}
	
	
	
	/*
	 * Go to Amazon.com
	 * SendKey on search Box (laptop)
	 * Click the search Button
	 */
	
	@Test
	public void searchAmazon() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}
}
