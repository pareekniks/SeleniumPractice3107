package SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil {

	/**
	 * Select the dropdown values using visible text
	 * 
	 * @param element
	 * @param value
	 */

	public static void selectDropdownByText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	/**
	 * Select the dropdown values using index
	 * 
	 * @param element
	 * @param index
	 */

	public static void selectDropdownByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	/**
	 * This method use to get the values from dropdown
	 * 
	 * @param element
	 */

	public static ArrayList<String> getDropDownValues(WebElement element) {
		Select select = new Select(element);

		List<WebElement> dropList = select.getOptions();
		System.out.println("total number of values of dropdown" + dropList.size());

		ArrayList<String> ar = new ArrayList<String>();

		for (int i = 0; i < dropList.size(); i++) {

			ar.add(dropList.get(i).getText());

			// System.out.println(dropList.get(i).getText());
		}
		return ar;
	}
	/**
	 * This method is used to select the values in a dropDown without select
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropDownValueWithoutSelectClass(WebDriver driver, String locator, String value) {
	List<WebElement> dropList=driver.findElements(By.xpath(locator));
	
	for(int i=0;i<dropList.size();i++) {
	if(dropList.get(i).getText().equals(value)) {
		dropList.get(i).click();
		break;
	}
	}
	
	}
}
