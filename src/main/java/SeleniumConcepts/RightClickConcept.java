package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.className("context-menu-one"))).build().perform();
		List<WebElement> rightClickList = driver
				.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]"));
		for (int i = 0; i < rightClickList.size(); i++) {
			
			System.out.println(rightClickList.get(i).getText());
		}

	}

}
