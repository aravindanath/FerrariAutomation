package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowser;

public class PrintAllLinks extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");
		List<WebElement>links =driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of Links "+ links.size());
		
		for(WebElement ele : links) {
			System.out.println(ele.getText()+" ---> "+ ele.getAttribute("href"));
		}
		
		
		
		
	}

}
