package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	
	WebDriver driver;
	SoftAssert softAssert;
	//BM -t1- AM
	//BM -t2- AM
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://accounts.zoho.com/signin");
		softAssert = new SoftAssert();
	}
	
	@Test(priority=1)
	public void signInPageTitleTest() {
		String title= driver.getTitle();
		System.out.println("Page title is"+ title);
		Assert.assertEquals(title, "Zoho Accounts");
		
	}
	@Test(priority=2)
	public void signUpLinkTest() {
		
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up Now")).isDisplayed());
		
	}
	
	@Test(priority=3)
	public void loginTest() {
		
		driver.findElement(By.id("login_id")).sendKeys("pareek.niks@hotmail.com");
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys("Nik@2412");
		driver.findElement(By.id("nextbtn")).click();
		softAssert.assertTrue(driver.findElement(By.id("profile_name")).isDisplayed());
		softAssert.assertEquals(driver.findElement(By.id("profile_name")).getText(), "Nikhil 1 Pareek", "Test case failed, Header text not matched");
		
		System.out.println(driver.getTitle());
		softAssert.assertEquals(driver.getTitle(), "12345");
		softAssert.assertAll();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}
