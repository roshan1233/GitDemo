package day21;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void testA()
	{
		System.out.println("Test2...");//print only in console
		Reporter.log("Test2*****");//print only  in html report
		Reporter.log("Test2%%%%",false);//print only in html 
		Reporter.log("Test2$$$$",true);//print in html and console
	}

}
