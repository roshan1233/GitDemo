package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/#");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-username")).sendKeys("Admin");
		driver.findElement(By.id("input-password")).sendKeys("pointofsale");
		driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(5000);
		String expected="Powered by OSPOS";
		System.out.println("Expected Title:"+expected);
		String actual=driver.getTitle();
		System.out.println("Actual Title:"+actual);
		
		if(actual.contains(expected))
		{
			System.out.println("Pass:Home Page is displayed");
		}
		else
		{
			System.err.println("Fail:Home Page is NOT displayed");
		}
		driver.quit();
	}
}
