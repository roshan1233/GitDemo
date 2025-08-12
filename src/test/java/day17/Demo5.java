package day17;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
	
		
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//button")).click();
		
		try 
		{
			driver.findElement(By.xpath("//a[text()='Logout']"));
			System.out.println("Pass:Homepage is displayed");
		}
		catch (Exception e)
		{
			
			System.out.println("Fail:Homepage is NOT displayed");
		}
		
		driver.quit();
	}

}