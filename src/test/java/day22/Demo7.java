package day22;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7 extends SuperClass
{
	@Test
	public void test7A()
	{
		Reporter.log("test7A",true);
	}
	
	@Test
	public void test7B()
	{
		Reporter.log("test7B",true);
	}
}
