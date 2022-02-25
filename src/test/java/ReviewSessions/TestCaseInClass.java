package ReviewSessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseInClass {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeTest() {
		// 1) Open the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// 2) Enter the URL “http://practice.automationtesting.in/”
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void test4() {
		wait = new WebDriverWait(driver, 30);

		// 3) Click on Shop Menu

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-40']/a")));

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();

		// 4) Now click on Home menu button

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='content']/nav/a"))));

		driver.findElement(By.xpath("//div[@id='content']/nav/a")).click();

		// 5) Test whether the Home page has Three Arrivals only

		wait.until(ExpectedConditions.visibilityOf(driver
				.findElement(By.xpath("//*[@id='themify_builder_content-22']/div[2]/div/div/div/div/div[2]/div"))));

		List<WebElement> allNewArrivalItems = driver
				.findElements(By.xpath("//*[@id='themify_builder_content-22']/div[2]/div/div/div/div/div[2]/div"));

		int numberOfNewArrivalItem = allNewArrivalItems.size();

		AssertJUnit.assertTrue(numberOfNewArrivalItem == 3);

		System.out.println("There are three items under new arrivals: PASSED");

		// 7) Now click the image in the Arrivals

		// store all images in List

		// 8) Test whether it is navigating to next page where the user can add that
		// book into his basket.

		for (int i = 0; i < numberOfNewArrivalItem; i++) {

			wait.until(ExpectedConditions
					.visibilityOfAllElements(driver.findElements(By.xpath("//*[@class='products']/li/a/img"))));

			List<WebElement> allItemImages = driver.findElements(By.xpath("//*[@class='products']/li/a/img"));

			// check if clicking on the image will navigate to the next page

			String currentUrl = driver.getCurrentUrl();

			allItemImages.get(i).click();

			String afterClickedUrl = driver.getCurrentUrl();

			AssertJUnit.assertFalse(currentUrl.equals(afterClickedUrl));

			System.out.println("Succesfully navigated the next page");
			
			//click on description tab
			
			driver.findElement(By.xpath("//*[@class='description_tab active']/a")).click();

			//11) There should be a description regarding that book the user clicked on
			
			AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id='tab-description']/h2")).isDisplayed());
			
			System.out.println("The description is appears: PASSED");
			
			List<WebElement> checkOutButton = driver.findElements(By.xpath("//button[@type='submit']"));

			if(checkOutButton.size()>0) {
			AssertJUnit.assertTrue(checkOutButton.size() > 0);
			System.out.println("This item is able to add to the basket: PASSED");
			}else {
				driver.navigate().back();
			}
			

			

		}

	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 8) Test whether it is navigating to next page where the user can add that
	 * book into his basket. 9) Image should be clickable and shoul navigate to next
	 * page where user can add that book to his basket 10) Click on Description tab
	 * for the book you clicked on. 11) There should be a description regarding that
	 * book the user clicked on
	 * 
	 */

}
