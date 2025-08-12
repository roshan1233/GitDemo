package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//login and check home page is displayed or not using element as ref
//logout and check login page is displayed or not using element as ref
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		try
		{
			driver.findElement(By.xpath("//span[text()='Dashboard']"));
			System.out.println("Pass:Homepage is displayed");
			
			driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
			try
			{
				driver.findElement(By.name("username"));
				System.out.println("Pass:Login is displayed");
			}
			catch (Exception e) 
			{
				System.out.println("Fail:Login is NOT displayed");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Fail:Homepage is NOT displayed");
		}
		
		
		
		
		driver.quit();
	}
}