package day21;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void testA()
	{
		System.out.println("Test3...");//print only in console
		Reporter.log("Test3*****");//print only  in html report
		Reporter.log("Test3%%%%",false);//print only in html 
		Reporter.log("Test3$$$$",true);//print in html and console
	}

}
