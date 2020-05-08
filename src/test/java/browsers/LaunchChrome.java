package browser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchChrome {
	
	WebDriver driver;
	
	String browser = "chrome";
	@BeforeTest
	public void openBrowser() {
		//for windows System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/drivers/chromedriver.exe");
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/drivers/chromedriver");
		driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/aravindanathdm/Documents/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
	}
	
	
	@Test
	public void text01() {
	 System.out.println("Just browser launched");
	 driver.get("https://www.google.com");
	 
	}

}
