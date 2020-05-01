package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC5 {
	/**
	 * Following method takes one parameter as input. Value of the said parameter is
	 * defined at suite level.
	 */
	WebDriver driver;

	@Parameters({ "firefox" })
	@Test
	public void prameterTestOne(String param) {
		if (param.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (param.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.com");
		System.out.println("Test one suite param is: " + param);
	}

	/**
	 * Following method takes one parameter as input. Value of the said parameter is
	 * defined at test level.
	 */
//	@Parameters({ "firefox" })
//	@Test
//	public void prameterTestTwo(String param) {
//		System.out.println("Test two param is: " + param);
//	}

}
