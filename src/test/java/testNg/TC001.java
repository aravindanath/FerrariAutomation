package testNg;

import org.testng.annotations.Test;

public class TC001 {
	
	/**
	 * Amazon end2end shopping
	 */
	
	@Test(priority=1)
	public void openBrowser() {
		System.out.println("Open browser");
	}
	
	@Test(priority=2)
	public void openUrl() {
		System.out.println("Open url");
	}
	
	@Test(priority=3)
	public void search() {
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
	}
	@Test(priority=7)
	public void addAddress() {
		System.out.println("add address");
	}
	@Test(priority=8)
	public void payment() {
		System.out.println("payment");
	}
	@Test(priority=9)
	public void closeBrowser() {
		System.out.println("close Browser");
	}
	
	
	
	
	
	
}
