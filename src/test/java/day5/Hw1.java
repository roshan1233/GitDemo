package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

	public static void main(String[] args) throws InterruptedException {
		//https://pos.aksharatraining.in/pos/public/
		//username admin
		//password: pointofsale
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://pos.aksharatraining.in/pos/public/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("pointofsale");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
