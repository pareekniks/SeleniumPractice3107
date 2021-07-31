package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaSciptTest {
	
	WebDriver driver;

	public JavaSciptTest(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/crm/login.html");
		
		
		System.out.println(JavaScriptUtil.getTitlebyJS(driver));
		
		
		//JavaScriptUtil.generateAlertByJS(driver, "This is my alert");
		
		JavaScriptUtil.refreshPageByJS(driver);
		
		System.out.println(JavaScriptUtil.getBrowserInfoByJS(driver));;
	//	JavaScriptUtil.clickElementByJS(driver, driver.findElement(By.className("zlogin-apps")));
		//JavaScriptUtil.sendKeysByJSUsingId(driver,"login_id" , "niks");
		//JavaScriptUtil.drawBorder(driver.findElement(By.className("zlogin-apps")), driver);
		
		WebElement SignIn= driver.findElement(By.className("zlogin-apps"));
		JavaScriptUtil.flash(SignIn, driver);
		
		System.out.println(JavaScriptUtil.getPageInnerText(driver));
		JavaScriptUtil.scrollPageDown(driver);
		JavaScriptUtil.scrollIntoView(SignIn, driver);
	}

}
