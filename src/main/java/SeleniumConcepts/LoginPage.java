package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Util util = new Util(driver);
		By errorMessage = By.id("div_login_error");
		util.doSendkeys(By.id("login1"), "pareekniks");

		util.doSendkeys(By.id("password"), "1234");

		util.doClick(By.xpath("//input[@type='submit']"));

		Thread.sleep(2000);
		System.out.println(util.getTextOfElement(errorMessage));

		util.closeBrowser(driver);

	}

}
