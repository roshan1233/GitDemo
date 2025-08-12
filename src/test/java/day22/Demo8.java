package day22;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo8 {

	@Parameters({"city","pin"})
	@Test
	public void test8(@Optional("Bengaluru") String c,@Optional("Chennai") String p)
	{
		Reporter.log("test8..."+c+p,true);
	}
}
