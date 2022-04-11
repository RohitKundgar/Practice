package VerificationUsingTestNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals_NotEquals 
{
  @Test
  public void f() 
  {
	  String a="Pune";
	  String b="Pune";
	  Assert.assertEquals(a, b,"String does not match");
	  
  }
}
