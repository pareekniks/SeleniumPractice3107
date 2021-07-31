package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	//Before -- Test -- After
	
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeTest
	public void launchURL() {
		System.out.println("Launch URL");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login to Applicaton");
	}
	
	@BeforeMethod
	public void goToHomePage() {
		System.out.println("Go To Home Page");
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		System.out.println("Home Page Title Verification");
	}
	
	@Test(priority=2, enabled=false)
	public void homePageHeader() {
		System.out.println("Home Page Header Verification");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Log Out");
	}
	
	@AfterClass
	public void goToLoginPage() {
		System.out.println("go to login page");
	}
	
	@AfterTest
	public void disconnectWithDB() {
		System.out.println("disconnectWithDB");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	

	
}
