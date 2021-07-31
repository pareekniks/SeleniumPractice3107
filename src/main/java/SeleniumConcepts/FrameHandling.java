package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//WebElement frameElement = driver.findElement(By.name("main"));

	//	System.out.println(driver.getPageSource());
		driver.switchTo().frame("main");
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		System.out.println("----------------------");
		driver.switchTo().defaultContent();
	

		System.out.println(driver.getPageSource());
		
		
	}

}
