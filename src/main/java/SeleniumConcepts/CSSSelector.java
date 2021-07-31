package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.zoho.in/signin?servicename=ZohoCRM&https://www.zoho.in/crm/signup.html?plan=enterprise");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// #username
		
		//Class
		// .classname
		
		// div>input[id='']
		
		//Reversing the Xpath
		//input[@id='login_id']/../../../../../../../../../..
		
	}

}
