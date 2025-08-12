package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {
	
	public static void forgotPassword(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
//driver.manage().window().
		//driver.findElement(By.("oxd-text oxd-text--p orangehrm-login-forgot-header")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.findElement(By.className("oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset")).click();
	
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.className("oxd-button oxd-button--large oxd-button--ghost orangehrm-forgot-password-button orangehrm-forgot-password-button--cancel")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.switchTo().activeElement().sendKeys(args)
		
		forgotPassword(driver);
	}

}
