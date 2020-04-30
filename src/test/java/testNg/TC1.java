package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC1 extends BaseClass{
	
	/**
	 * Amazon end2end shopping
	 */

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

	
	
	
	
	
}
