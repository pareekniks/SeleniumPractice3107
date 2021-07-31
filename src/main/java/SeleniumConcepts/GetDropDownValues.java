package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);

		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		getDropDownValues(Day);
		getDropDownValues(Month);
		getDropDownValues(Year);

	}
	/**
	 * This method use to get the values from dropdown
	 * @param element
	 */

	public static void getDropDownValues(WebElement element) {
		Select select = new Select(element);

		List<WebElement> dropList = select.getOptions();
		System.out.println("total number of values of dropdown" + dropList.size());

		for (int i = 0; i < dropList.size(); i++) {

			System.out.println(dropList.get(i).getText());

		}
	}

}
