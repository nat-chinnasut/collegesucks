package ReviewSessions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class droDownFeruk {
	WebDriver driver;
	private String url = "https://demo.guru99.com/test/newtours/register.php";

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void Test1() throws InterruptedException {
		//firstName
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Phanuwat");
		//lastName
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Janthima");
		//phone
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("703-888-9999");
		//email
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tom_jr@techcircle.edu");
		//adress
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("9899 Jupiter ST");
		//city
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Party City");
		//sate
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TommorrowLand");
		//postal code
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("98999");
		//country
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(country);
		
		Thread.sleep(2000);
		select.selectByVisibleText("BELGIUM");
		//username
		driver.findElement(By.id("email")).sendKeys("party_person@edc.com");
		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc12345$$");
		//confirm password
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("abc12345$$");
		//submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
