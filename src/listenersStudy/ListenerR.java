package listenersStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListenerR implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Test case started successfully", true);
		ITestListener.super.onTestStart(result);	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test case successfully completed", true);
		ITestListener.super.onTestSuccess(result);
		
	}
	
//	@Override
//	public void onTestFailure(ITestResult result) 
//	{
//		Reporter.log("Test case Failed ", true);
//		ITestListener.super.onTestFailure(result);
//		
//	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		ITestListener.super.onTestSkipped(result);
		Reporter.log("OOPS!!!! Test case was skipped.", false);
		
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		Reporter.log("Test case failed due to timeout ", false);
		ITestListener.super.onTestFailedWithTimeout(result);
	}
}
