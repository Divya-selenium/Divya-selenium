package Testng2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1 {

	@Test(priority=1)
	public void call()
	{
		Reporter.log("Call", true);
		
	}
	@Test (invocationCount = 3,enabled = false)
	public void message()
	{
		Reporter.log("Message", true);
		
	}
}


