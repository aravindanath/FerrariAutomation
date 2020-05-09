package testNg;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import browsers.LaunchChromeUsingWM;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExapleDepondsonAmzzon extends LaunchChromeUsingWM{
	
	/**
	 * Amazon end2end shopping
	 */

	
	
	@Test
	public void openUrl() {
		System.out.println("Open url");
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
		
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, "online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

		
	}
	
	@Test(dependsOnMethods="openUrl")
	public void homePage() {
		
		System.out.println("Successfully logined in!");
	
		
	}
	
	
//	@Test(dependsOnMethods="openUrl",description="This is a search method")
//	public void search() {
//		System.out.println("ipad pro 2020");
//	}
//	
//	@Test (dependsOnMethods="search")
//	public void plp() {
//		System.out.println("product listing page");
//		throw new SkipException("Skipping the flow");
//	}
//	
//	@Test(dependsOnMethods="plp")
//	public void pdp() {
//		System.out.println("product discription page");
//	}
//	
//	@Test  (dependsOnMethods="pdp")
//	public void addToCart() {
//		System.out.println("add to cart");
//	}
//	@Test (dependsOnMethods="addToCart")
//	public void addAddress() {
//		System.out.println("add address");
//	}
//	@Test (dependsOnMethods="addAddress")
//	public void payment() {
//		System.out.println("payment");
//	}

	
	
	
	
	
}
