package ReviewSessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertWithFeruk {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void  alertTest123() throws InterruptedException {
		
		//First
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().getText();
		
//		//second
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(6000);
//		driver.switchTo().alert().accept();
//		
		
		//thrid
		
//		driver.findElement(By.id("confirmButton")).click();
//		driver.switchTo().alert().accept();
//		driver.findElement(By.id("confirmResult")).isDisplayed();
//		
////		
//		Thread.sleep(6000);
////		
////		
		//4rd
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("feruk");
		driver.switchTo().alert().accept();
//		
	}
	

}
