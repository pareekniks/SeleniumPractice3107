package SeleniumConcepts;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String date ="19-जनवरी-2021";
		String datval[] = date.split("-");
		
		DropDownUtil.selectDropdownByText(day, datval[0]);

		DropDownUtil.selectDropdownByText(month, datval[1]);

		DropDownUtil.selectDropdownByText(year, datval[2]);
	
		
		ArrayList<String> monthsList= DropDownUtil.getDropDownValues(month);
		for (Iterator iterator = monthsList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}

	}

}
