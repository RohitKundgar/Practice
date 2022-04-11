package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestNGStudy 
{
  @Test(timeOut = 1000)
  public void f() throws InterruptedException 
  {
	  Thread.sleep(1500);
	  Reporter.log("Browser Running Test cases", true);
  }
  @AfterClass
  public void fu() 
  {
	  Reporter.log("Closing the Browser", true);
  }
  @AfterMethod
  public void fuc() 
  {
	  Reporter.log("Printing Test Cases", true);
  }
  @BeforeMethod
  public void fuc1() 
  {
	  Reporter.log("Browser is running", true);
  }
 
  
}
