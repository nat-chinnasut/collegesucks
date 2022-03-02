package Day11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTesting {
	
	
	@Test(dataProvider = "nameList")
	public void myTest(String myName, String lastName, Integer age) {
		System.out.println("My Name is " + myName + " lastName is " + lastName + " and age is "+ age);
	}
	
	@Test(dataProvider = "ageList", enabled=true)
	public void ageTest(Integer age) {
		System.out.println("My age is " + age);
	}
	
	
	@DataProvider(name ="nameList")
	public Object[][] nameMethod(){
		
		return new Object[][] {{"Shafkat", "Ali", 33},{"Irfan", "Yuksel", 34},{"TechCircle", "LLC", 3}};
	}
	
	@DataProvider(name ="ageList")
	public Integer[][] ageMethod(){
		
		return new Integer[][] {{33},{44}};
	}

}
