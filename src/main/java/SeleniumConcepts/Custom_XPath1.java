package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_XPath1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//input[@name='LOGIN_ID']
		
		//input[@name='LOGIN_ID' and @id='login_id']
		
		//contains function
		//text function
		//starts-with
		// * can be used for all html tags
		
		// ---/ used for direct child
		// user for direct + indirect
		//position and last is also function to get the  xpath on the basis of indexing
		
		//XPATH AXIS
		//Following, Preceeding, Parent, Child, ancestor 
	}

}
