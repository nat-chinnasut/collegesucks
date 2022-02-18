package Day6;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class actionClassTest {
	
	
	
	
	WebDriver driver;
	Actions action;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(PropertiesReader.getProperty("amazonUrl"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void moveToElementTest() {
		
		action = new Actions(driver);
		
		WebElement accountListButton = driver.findElement(By.xpath(PropertiesReader.getProperty("accountListButton")));
		
		action.moveToElement(accountListButton).build().perform();
		
	
		
	}
	
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
		
		
		driver.navigate().to(PropertiesReader.getProperty("dragAndDropURL"));
		action = new Actions(driver);
		
		Thread.sleep(3000);

		
		action.dragAndDrop(driver.findElement(By.id(PropertiesReader.getProperty("draggable"))), driver.findElement(By.id(PropertiesReader.getProperty("droppable")))).build().perform();
		
		
	}
	
	
	
	
	
	
}
