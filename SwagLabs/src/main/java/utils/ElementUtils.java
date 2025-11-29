package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	
	WebDriver driver;
	WaitUtils waitUtils;
	public ElementUtils(WebDriver driver) {
		super();
		this.driver = driver;
		waitUtils = new WaitUtils(driver);
	}
	
	public void type(WebElement element, String value) {
		waitUtils.waitForVisibility(element);
        element.clear();
		element.sendKeys(value);
    }

    public void click(WebElement element) {
        // wait + click
    	waitUtils.waitForClickable(element);
		element.click();;
    }

    public String getText(WebElement element) {
        waitUtils.waitForVisibility(element);
        return element.getText();
    }
	
	
}
