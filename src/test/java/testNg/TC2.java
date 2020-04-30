package testNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 extends BaseClass{
	
	/**
	 * Amazon end2end shopping
	 */
	 
//	@BeforeTest
//	public void openUrl() {
//		
//		
//	}
//	
	
	@Test 
	public void search() {
		driver.get("https://www.amazon.com");
		System.out.println("ipad pro 2020");
	}
	
	@Test 
	public void plp() {
		System.out.println("product listing page");
	}
	
	@Test 
	public void pdp() {
		System.out.println("product discription page");
	}
	
	@Test 
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test 
	public void addAddress() {
		System.out.println("add address");
	}
	@Test 
	public void payment() {
		System.out.println("payment");
	}
 
	
	
	
	
	
}
