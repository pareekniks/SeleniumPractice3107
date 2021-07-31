package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.id("login1")).sendKeys("pareek.niks");
		driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(driver.findElement(By.id("login1")).getAttribute("value"));

	}

}
