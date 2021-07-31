package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(5000);
		
		WebElement Day  = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		DropDownHandling dd = new DropDownHandling();
		dd.selectDropdownByText(Day, "24");
		dd.selectDropdownByText(Month, "दिसंबर");
		dd.selectDropdownByText(Year, "1987");
		
		selectDropdownByIndex(Day, 1);
		selectDropdownByIndex(Month, 11);
		dd.selectDropdownByIndex(Year, 1);
	
		

	}
	
	
	public void selectDropdownByText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
		
		
	}
	
	public static void selectDropdownByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
		
		
	}

}
