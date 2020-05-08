package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowser;

public class ByName  extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium jobs in bangalore",Keys.ENTER);
		
		String pgtitle = driver.getTitle();
		
		System.out.println("Page title "+ pgtitle);
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Sravani");
		driver.findElement(By.name("lastname")).sendKeys("gp");
		
		Thread.sleep(2000);
 
	}

}
