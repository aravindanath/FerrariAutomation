package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssert {

	@Test(priority = 1)
	public void HardAssert() {

		String title = "Learning TESTNG";

		System.out.println("Starting.....");

		Assert.assertEquals(title, "Wrong", "Mis match");

		System.out.println("Ending.....");
	}

	@Test
	public void softAssert() {

		String title = "Learning TESTNG";

		System.out.println("Starting.....");
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(title, "Learing", "Mis match");
		System.out.println("Ending.....");
		sf.assertAll();
	}
}
