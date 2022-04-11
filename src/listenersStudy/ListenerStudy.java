package listenersStudy;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listenersStudy.ListenerR.class)
public class ListenerStudy 
{
  @Test(priority = 1)
  public void a() 
  {
	  System.out.println("this is method a");
	  
  }
  
  
  @Test(timeOut = 1000, priority = 2)
  public void b() throws InterruptedException
  {
	  Thread.sleep(1200);
	  System.out.println("this is method b");
  }
  
  
  @Test(dependsOnMethods = "b")
  public void c()
  {
	  System.out.println("this is method c");
  }
}
