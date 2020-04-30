package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void capLogs() {
		System.out.println("Start logs......");
		
	}
	
	
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Open browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close Browser");
		
		driver.close();
		
	}
	
	@AfterSuite
	public void stopLogs() {
		System.out.println("ENd logs......");
		
	}
	
	
	

}
