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

public class actionClassTest {
	
	
	
	
	WebDriver driver;
	Actions action;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void moveToElementTest() {
		
		action = new Actions(driver);
		
		WebElement accountListButton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		
		action.moveToElement(accountListButton).build().perform();
		
	
		
	}
	
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
		
		
		driver.navigate().to("http://the-internet.herokuapp.com/drag_and_drop");
		action = new Actions(driver);
		
		Thread.sleep(3000);

		
		action.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).build().perform();
		
		
	}
	
	
	
	
	
	
}
