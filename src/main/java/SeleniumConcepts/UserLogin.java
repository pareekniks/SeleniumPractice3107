package SeleniumConcepts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) {
	
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zoho.com/crm/signup.html");
		doLogin(driver, getUserMap(), "pateint");
		

	}
	
	public static Map<String, String> getUserMap() {
		Map<String, String> userMap=new HashMap<String, String>();
		userMap.put("admin", "admin_admin");
		userMap.put("pateint", "tom@gmail.com_pateint123");
		
		userMap.put("doctor", "peter@gmail.com_doctor12");
		
		return userMap;
	}
	
	public static void doLogin(WebDriver driver,Map<String, String> userMap, String userKey ) {
		
		driver.findElement(By.id("email")).sendKeys(userMap.get(userKey).split("_")[0]);
		driver.findElement(By.className("sgnpaswrd")).sendKeys(userMap.get(userKey).split("_")[1]);
	}

}
