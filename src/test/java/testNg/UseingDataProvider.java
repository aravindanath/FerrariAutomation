package testNg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseingDataProvider {

	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	

	@Test(dataProvider = "getData") 
	public void login(String user, String password) throws InterruptedException {
		
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("login1")).sendKeys(user);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.name("proceed")).click();
		
		String text = driver.findElement(By.xpath("//b[text()='Wrong username and password combination.']")).getText();
		
		Assert.assertEquals(text, "Wrong username and password .","Title mis match");
		 

	}
	

	@DataProvider
	public Object[][] getData() { //row col
		Object[][] data = new Object[8][2];
		data[0][0] = "aravindnath.dm222@myntra.com";
		data[0][1] = "myntra@123";
		data[1][0] = "ankush@myntra.com";
		data[1][1] = "myntra#123";
		data[2][0] = "lekya@myntra.com";
		data[2][1] = "myntra#123";
		data[3][0] = "prince@myntra.com";
		data[3][1] = "myntra#123";
		data[4][0] = "leyana@myntra.com";
		data[4][1] = "myntra#123";
		data[5][0] = "priyanka@myntra.com";
		data[5][1] = "myntra#123";
		data[6][0] = "kiran@myntra.com";
		data[6][1] = "myntra#123";
		data[7][0] = "aravind@myntra.com";
		data[7][1] = "aravind";
		return data;

	}

	//@AfterTest
	public void close() {
		driver.close();
	}

}
