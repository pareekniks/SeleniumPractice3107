package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement userName = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));

		Actions act = new Actions(driver);
		act.sendKeys(userName, "pareek.niks");

		act.sendKeys(password, "pareek.niks");

		act.click(driver.findElement(By.name("proceed"))).build().perform();

	}

}
