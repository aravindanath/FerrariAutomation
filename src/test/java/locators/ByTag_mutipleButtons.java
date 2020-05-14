package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTag_mutipleButtons extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");

//		List<WebElement>input = driver.findElements(By.tagName("a"));
		List<WebElement>input = driver.findElements(By.xpath("//a"));
		System.out.println(input.size());
		
		for(WebElement ele : input) {
			System.out.println(ele.getText() +" ---> "+ ele.getAttribute("href"));
		}

	}

}
