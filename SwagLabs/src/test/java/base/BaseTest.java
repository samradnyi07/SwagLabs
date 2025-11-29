package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;

public class BaseTest{
	
	 protected WebDriver driver;
	
	@BeforeMethod
	public void initTest() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		prop.load(fis);
		DriverFactory.initWebDriver(prop.getProperty("browser"));
		driver = DriverFactory.getDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
