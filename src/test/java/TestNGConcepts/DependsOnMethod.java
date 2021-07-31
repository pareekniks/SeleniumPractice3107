package TestNGConcepts;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void login() {
		System.out.println("login to app");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="login")
	public void homePageTest() {
		System.out.println("homePageTest to app");
	}
	
	@Test(dependsOnMethods="login")
	public void conatctsTest() {
		System.out.println("conatctsTest");
	}

}
