package testNg;

import org.testng.Assert;
import org.testng.annotations.*;
 

public class ExampleFail {
	
	@BeforeTest
	public void bt() {
		System.err.println("before test 1");
	}
	
	@AfterTest
	public void sf() {
		System.err.println("after test 1");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		
		System.out.println("test 2");
		int age = 16;
		
		if(age<=18) {
			Assert.fail("Age is < 18");
		}
		
	}


	@Test
	public void test3() {
		System.out.println("test 3");
	}


	@BeforeMethod
	public void bm() {
		System.out.println("+++++++++++ Before Method +++++++++++");
	}
	@AfterMethod
	public void am() {
		System.out.println("############ After Method ############");
	}
}
