package day17;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Selenium 3
		Duration iwd = driver.manage().timeouts().getImplicitWaitTimeout();//only Selenium 4
		System.out.println(iwd);//PT0s
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Selenium 4
		
		iwd = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(iwd);//PT10S
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();

	}

}