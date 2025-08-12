package day22;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 extends BaseClass
{
	@Test
	public void test3()
	{
		Reporter.log("Test3...",true);
	}
	
	@Test
	public void test4()
	{
		Reporter.log("Test4...",true);
	}
}
