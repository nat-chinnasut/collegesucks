package ReviewSessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsReview {
	
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
//		myName = "Risa";
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void test() {
		
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		driver.switchTo().alert().accept();
		
		
	}
	
	
	

}
