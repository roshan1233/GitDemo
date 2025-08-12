package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3 {

	WebDriver driver;
	
	@BeforeMethod
	public void m1()
	{
		driver=new ChromeDriver();
	}

	@Test
	public void testA() throws InterruptedException
	{
		
		driver.get("http://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="google";
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle);//compare
		driver.findElement(By.xpath("//a")).click();
		Thread.sleep(3000);
		softAssert.assertAll();//report
		//do not write any code after assertAll
		
	}
	
	@AfterMethod
	public void m2()
	{
		driver.quit();
	}
}
