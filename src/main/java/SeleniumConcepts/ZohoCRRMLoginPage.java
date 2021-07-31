package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZohoCRRMLoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.zoho.in/signin?servicename=ZohoCRM&https://www.zoho.in/crm/signup.html?plan=enterprise");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		By eMailId = By.id("login_id");
		Util util = new Util(driver);
		util.waitForElement(eMailId, driver, 5);

		driver.findElement(eMailId).sendKeys("pareek.niks@hotmail.com");

	}

}
