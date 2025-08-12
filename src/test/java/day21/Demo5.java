package day21;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {

	@Test
	public void test5a()
	{
		for(int i=1;i<=5;i++)
		{
			Reporter.log("Test5a...",true);  //code is executed 5 times --> in report -1 Test
		}
		
	}
	
	
	@Test(invocationCount = 5)
	public void test5b()
	{
		
		Reporter.log("Test5b...",true);//code is executed 5 times--> 5 test report 
		
	}
}
