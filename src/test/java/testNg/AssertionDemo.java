package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {

	WebDriver driver;

	@Test
	public void assertTitle() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Reporter.log(driver.getCurrentUrl());
		String title;
		title = driver.getTitle();
		Reporter.log("Page title is " + title);
		System.out.println("Page title is " + title);
		
		Assert.assertEquals(title, "Google","Title mis match!");

		driver.findElement(By.name("q")).sendKeys("Selenium jobs in bagalore", Keys.ENTER);
		title = driver.getTitle();
		
		
		Reporter.log("Page title is " + title);
		System.out.println("Page title is " + title);
		Assert.assertEquals(title, title,"Title mis match!");
		

	}

}
