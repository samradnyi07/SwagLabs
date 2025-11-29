package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	static WebDriver driver;
	public static void initWebDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public static WebDriver getDriver() {
	
		return driver;
	}
	
	
}
