package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpath_following_axisFunction extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("http://the-internet.herokuapp.com/tables");

		String name = "Frank";		
		String text =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'"+name+"')]//following::td[3]")).getText();
		
		System.out.println(text);


		Thread.sleep(5000);

	}


}
