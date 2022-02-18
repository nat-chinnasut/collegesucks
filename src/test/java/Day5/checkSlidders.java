package Day5;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkSlidders {

	WebDriver driver;

	@Before
	public void beforeMethod() {
//		1) Open the browser
//		2) Enter the URL “http://practice.automationtesting.in/”

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");

	}

	@Test
	public void TestCase1() {

//		3) Click on Shop Menu
		driver.findElement(By.xpath("//li[@id='menu-item-40']")).click();

//		4) Now click on Home menu button
		driver.findElement(By.xpath("//div[@id='content']/nav/a")).click();

//		5) Test whether the Home page has Three Sliders only
		// coming back to this test case next week to complete steps

		List<WebElement> sliders = driver.findElements(By.xpath("//*[@id='n2-ss-6']/div"));
		
		int numberOfSliders = sliders.size();
		
		
		if(numberOfSliders==3) {
			System.out.println("Sliders count is 3");
		}else {
			System.out.println("failed");
		}
		
	}

}
