package Day7;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesTest {
	
	
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
	public void loginAgentFrontEndPage() {
		
		String Email = "agent@phptravels.com";
		String Password  = "demoagent";
		
		//should open up the front end page
		driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a")).click();
		
		//switch my selenium to new window
		
		System.out.println("Before switching -- title is --> " + driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		//prints what the main windows handle looks like
		 String MainWindow = driver.getWindowHandle();
		 System.out.println("Main window handle is " + MainWindow);
		
		driver.switchTo().window(childID);
		System.out.println("After Switching to Child window >> " + driver.getTitle());
		
	
		//try login in to front end agent application
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")).sendKeys(Password);

		
//		driver.switchTo().window(parentID);
		
		
		
	}
	
	

}
