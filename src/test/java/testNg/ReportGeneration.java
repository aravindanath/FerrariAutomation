package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ReportGeneration implements ITestListener {

	public void onFinish(ITestContext context) {
		Reporter.log("On Finish " + context.getName());
	}

	public void onStart(ITestContext context) {
		Reporter.log("On Start " + context.getName());
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("on Fail " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("on skip " + result.getName());
	}

	public void onTestStart(ITestResult result) {
		Reporter.log("on start " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("on sucess " + result.getName());
	}

}
