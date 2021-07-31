package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.partialLinkText("Follow On Twitter")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		System.out.println(parentWindow);
		String childWindow = it.next();

		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		System.out.println("Child Window Title-----" + driver.getTitle());
		driver.close();
		driver.switchTo().window( parentWindow);

		System.out.println("Parent Window Title-----" + driver.getTitle());
		//driver.switchTo().defaultContent();

	}

}
