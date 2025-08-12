package day24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Goodle";
//		if(actualTitle.equals(expectedTitle))
//		{
//			Reporter.log("TC is PASS",true);
//		}
//		else
//		{
//			Reporter.log("TC is FAILED",true);
//			Assert.fail();//inform testNG to mark this test as FAILED
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
}
