package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);

		
		List<WebElement> days=driver.findElements(By.xpath("//select[@id='day']/option"));
		
		String day = "//select[@id='day']/option" ;
		String month = "//select[@id='month']/option" ;
		String year = "//select[@id='year']/option" ;
		
		DropDownUtil.selectDropDownValueWithoutSelectClass(driver, day, "19");
		DropDownUtil.selectDropDownValueWithoutSelectClass(driver, month, "जनवरी");
		DropDownUtil.selectDropDownValueWithoutSelectClass(driver, year, "2021");
		
	}

}
