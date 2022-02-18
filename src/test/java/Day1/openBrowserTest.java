package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		 WebDriverManager.chromedriver().setup();
		 
		driver = new ChromeDriver();
		
		driver.get("https://www.techcircleschool.com");
		
		
		
		

	}

}
