package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	WebDriver driver;

	public WaitUtils(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void waitForVisibility(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}
	
	public void waitForClickable(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
}
