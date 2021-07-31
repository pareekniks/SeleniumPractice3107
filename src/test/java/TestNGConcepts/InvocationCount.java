package TestNGConcepts;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount= 10)
	public void homePageTest() {
		System.out.println("homePageTest to app");
	}
	

}
