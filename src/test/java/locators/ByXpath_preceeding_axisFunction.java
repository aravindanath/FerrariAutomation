package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ByXpath_preceeding_axisFunction extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("http://the-internet.herokuapp.com/tables");

		String name ="Tim";

		String web = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'NAME')]//following::td[3]".replace("NAME",name))).getText();

		System.out.println(web);
		//

		String lastName = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'NAME')]//preceding-sibling::td".replace("NAME",name))).getText();
		System.out.println(lastName);

		Thread.sleep(5000);
		
		
		driver.get("https://www.facebook.com/");
		String gender = "Female";
		
		
		driver.findElement(By.xpath("//label[text()='GEN']//preceding-sibling::input".replace("GEN", gender))).click();;
		Thread.sleep(5000);
		WebElement gen =driver.findElement(By.xpath("//label[text()='GEN']//preceding-sibling::input".replace("GEN", gender)));
		if(gen.isSelected()) {
			String m = "Male";
			driver.findElement(By.xpath("//label[text()='GEN']//preceding-sibling::input".replace("GEN", m))).click();;
		}
		Thread.sleep(5000);
	}
	
	


}
