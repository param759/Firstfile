package Testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" ho gyaa pass");
	}

}
