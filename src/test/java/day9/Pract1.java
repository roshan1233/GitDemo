package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		String expected="dashboard";
		System.out.println("Expected"+expected);
		
		String actual=driver.getTitle();
		System.out.println("Actual "+actual);
		
		if(actual.contains(expected))
		{
			System.out.println("Pass: Test successfull");
		}
		else
		{
			System.err.println("Fail: Test not successfull");
		}
		driver.quit();
	}

}
