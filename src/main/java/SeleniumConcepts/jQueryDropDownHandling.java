package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jQueryDropDownHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("justAnInputBox")).click();
		selectChoiceValues(driver, "choice 1", "choice 2","choice 2 1","choice 2 2","choice 2 3","choice 3","choice 4","choice 5","choice 6 2 2","choice 7");
		


	}
	
	
	public static void selectChoiceValues(WebDriver driver, String...value) {
		List<WebElement> choice=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));
		for (int i = 0; i < choice.size(); i++) {
			
			System.out.println(choice.get(i).getText());
			for(int k=0;k<value.length;k++) {
				if(choice.get(i).getText().equals(value[k])) {
					choice.get(i).click();
					break;
			}
			
			
				
			}
			
		}
	}

}
