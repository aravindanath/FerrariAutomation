package testNg;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExapleDepondson{
	
	/**
	 * Amazon end2end shopping
	 */

	
	
	@Test
	public void openUrl() {
		System.out.println("Open url");
	}
	
	
	@Test(dependsOnMethods="openUrl",description="This is a search method")
	public void search() {
		System.out.println("ipad pro 2020");
	}
	
	@Test (dependsOnMethods="search")
	public void plp() {
		System.out.println("product listing page");
		throw new SkipException("Skipping the flow");
	}
	
	@Test(dependsOnMethods="plp")
	public void pdp() {
		System.out.println("product discription page");
	}
	
	@Test  (dependsOnMethods="pdp")
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test (dependsOnMethods="addToCart")
	public void addAddress() {
		System.out.println("add address");
	}
	@Test (dependsOnMethods="addAddress")
	public void payment() {
		System.out.println("payment");
	}

	
	
	
	
	
}
