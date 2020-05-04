package testNg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

//@Listeners(ReportGeneration.class)
public class TC1 extends BaseClass{
	
	/**
	 * Amazon end2end shopping
	 */

	@Test(priority=3)
	public void search() {
		driver.get("https://www.facebook.com");
		System.out.println("ipad pro 2020");
	}
	
	@Test(priority=4)
	public void plp() {
		System.out.println("product listing page");
	}
	
	@Test(priority=5)
	public void pdp() {
		System.out.println("product discription page");
	}
	
	@Test(priority=6)
	public void addToCart() {
		System.out.println("add to cart");
		throw new SkipException("Skipping");
	}
	@Test(priority=7)
	public void addAddress() {
		System.out.println("add address");
		Assert.fail("Fail..");
	}
	@Test(priority=8)
	public void payment() {
		System.out.println("payment");
	}

	
	
	
	
	
}
