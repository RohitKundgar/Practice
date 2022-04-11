package listenersStudy;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listenersStudy.ListenerR.class)

public class AnotherListener 
{
  @Test(priority = 1)
  public void d() 
  {
	  System.out.println("This is method d");
  }
  
  @Test(priority = 2)
  public void e()
  {
	  System.out.println("This is method e");
  }
  
  @Test(priority = 3)
  public void f()
  {
	  System.out.println("This is method f");
  }
  
}
