package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {
	public static void move(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
		
		move(driver);
		
		driver.manage().window().minimize();
		
	//	driver.switchTo().activeElement().sendKeys(Keys.CONTROL+"a");

	}

}
