package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo9 {

	@Parameters("browser")
	@Test
	public void test9(String browser)
	{
		WebDriver driver;
		
		if(browser.equals("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
			Point p=new Point(800,10);
			driver.manage().window().setPosition(p);
		}

		driver.get("https://pos.aksharatraining.in/pos/public/");
		for(int i=1;i<=100;i++)
		{
		
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys("admin");
		
		}
		
		driver.quit();
	}
}
