package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureErrorText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.id("login1")).sendKeys("pareek.niks");

		driver.findElement(By.id("password")).sendKeys("pareek.niks");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("div_login_error")).getText());

	}

}
