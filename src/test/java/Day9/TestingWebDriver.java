package Day9;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class TestingWebDriver {
	
	@BeforeMethod
	public void setUp() {
		Driver.getDriver();
	}
	
	@Test
	public void test1() {
		
	}
	
	@AfterMethod
	public void afterMethod() {
		Driver.tearDown();
	}
	

}
