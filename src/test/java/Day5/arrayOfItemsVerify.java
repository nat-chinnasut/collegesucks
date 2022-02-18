package Day5;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class arrayOfItemsVerify {

	

	WebDriver driver;

	@Before
	public void beforeMethod() {
//		1) Open the browser
//		2) Enter the URL “http://practice.automationtesting.in/”

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.etsy.com/?ref=lgo");

	}
	
	@Test
	public void test() {
		
		driver.findElement(By.xpath("//*[@id='global-enhancements-search-query']")).sendKeys("iphone", Keys.ENTER);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[4]/div[5]/div[3]/div[9]/div/div/div[1]/ul/li"));
		
		
		
		
//		
//		for(WebElement eachItem:searchResults) {
//		String text =	eachItem.getText();
//		System.out.println("---------------------------\n"+ text + "---------------------------\n");
//		}
		
		
		
		
		
		
		
		
//		
//		
	}
	
	
	
	
	
	
	
	
	
	
}
