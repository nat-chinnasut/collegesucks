package Day11;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class passingParameters {
	
	
	@Parameters({"val1","val2"})
	@Test
	public void SumOf(int v1, int v2) {
		int finalSum = v1+v2;
		
		System.out.println("The final sum of the given values is " + finalSum);
	}
	
	
	
	
	
	
	

}
