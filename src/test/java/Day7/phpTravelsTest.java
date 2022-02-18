package Day7;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class phpTravelsTest {

	//
	WebDriver driver;
	private String url = "https://phptravels.com/demo";

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void bankTransferLinkPageWorking() throws InterruptedException {

		String Email = "agent@phptravels.com";
		String Password = "demoagent";

		// should open up the front end page
		driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a"))
				.click();

		// switch my selenium to new window

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);

		// try login in to front end agent application

		// username
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"))
				.sendKeys(Email);
		// password
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"))
				.sendKeys(Password);

		// clicks ok on the cookie popup
		driver.findElement(By.xpath("//*[@id=\"cookie_stop\"]")).click();

		// loginButton
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();

		Thread.sleep(3000);

		// continue the rest of the test case

		// click add funds
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a")).click();
		// check in bank transfer
		driver.findElement(By.id("gateway_bank-transfer")).click();
		// click play now
		driver.findElement(By
				.xpath("//*[@id='fadein']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button"))
				.click();
		// verify if the Back to invoices visible
		WebElement backToInvoicesButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]"));
		Assert.assertTrue(backToInvoicesButton.isDisplayed());
		backToInvoicesButton.click();
		// click yes
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/a")).click();

	}

}
