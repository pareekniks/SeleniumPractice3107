package SeleniumConcepts;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		System.out.println(driver.getTitle());
		driver.navigate().to("https://ui.cogmento.com/");

		System.out.println(driver.getTitle());
		//driver.navigate().back();

		System.out.println(driver.getTitle());
		/*
		 * driver.navigate().forward(); driver.navigate().refresh();
		 */

	}

}
