package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		if (driver.getTitle().equals("Google")) {
			System.out.println("correct Title");
		} else {
			System.out.println("Incorrect Title");
		}

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		driver.close();

	}

}
