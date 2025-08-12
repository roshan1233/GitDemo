package day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {
//can we handle findElement without using- implicit wait/ explicit wait/Sleep/FluentWait?
//yes-custom wait
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		for(int i=1;i<=100;i++)
		{
				try 
				{		
					driver.findElement(By.name("username")).sendKeys("Admin");
					System.out.println("UN is present");
					
					break;
				}
				catch (Exception e)
				{
					System.out.println("UN not present:"+i);
				}
		}
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
	}
}