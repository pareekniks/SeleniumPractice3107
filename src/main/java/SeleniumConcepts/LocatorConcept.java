package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement eMail = driver.findElement(By.name("username"));
		eMail.sendKeys("pareek.niks@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
