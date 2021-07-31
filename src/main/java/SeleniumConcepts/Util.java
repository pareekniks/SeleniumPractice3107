package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;

	public Util(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is used to create the webElement on the basis of By Locator
	 * 
	 * @param locator
	 * @return WebElement
	 */
	public WebElement getElement(By locator) {

		WebElement element = null;
		try {

			element = driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Some exception occured while creating the webElement");
			System.out.println(e.getMessage());
		}
		return element;
	}

	/**
	 * 
	 * This method is used to click on the webElement on the basis of By Locator
	 * 
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("Some exception occured while clicking on the WebElement");
			System.out.println(e.getMessage());
		}

	}

	/**
	 * 
	 * @param locator
	 * @param value
	 */
	public void doSendkeys(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("Some exception occured while sending the value in the WebElement");
			System.out.println(e.getMessage());
		}

	}

	/**
	 * This method is used to close the browser
	 * 
	 * @param driver
	 */

	public void closeBrowser(WebDriver driver) {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println("Some exception occured while closing the browser");
			System.out.println(e.getMessage());
		}

	}

	/**
	 * This method get the value from any webElement
	 * 
	 * @param locator
	 * @return
	 */

	public String getTextOfElement(By locator) {
		String textValue = null;
		try {
			textValue = getElement(locator).getText();
		} catch (Exception e) {
			System.out.println("Some exception occured while  capturing the values");
			System.out.println(e.getMessage());
		}
		return textValue;
	}

	/**
	 * This method wait for element
	 * 
	 * @param locator
	 * @param driver
	 * @param waitTime
	 */
	public void waitForElement(By locator, WebDriver driver, int waitTime) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		} catch (Exception e) {
			System.out.println("Some exception occured while  waiting for the element");
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * This method wait for title
	 * 
	 * @param locator
	 * @param driver
	 * @param waitTime
	 * @return 
	 */
	public String waitForTitle(String  title, WebDriver driver, int waitTime) {
		
		String returnedTitle=null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.titleContains(title));
			return driver.getTitle();
			

		} catch (Exception e) {
			System.out.println("Some exception occured while  waiting for the element");
			System.out.println(e.getMessage());
		}
		return returnedTitle;
	}
}
