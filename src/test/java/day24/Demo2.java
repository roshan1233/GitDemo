package day24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {

	WebDriver driver;
	@BeforeMethod
	public void m1()
	{
		driver=new ChromeDriver();
	}

	@Test
	public void testA()
	{
		
		driver.get("http://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="google";
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	@AfterMethod
	public void m2()
	{
		driver.quit();
	}
}
