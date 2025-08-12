package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pointofsale");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://pos.aksharatraining.in/pos/public/items']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//td[text()='laptop']/../td[1]")).click();
		
		//driver.findElement(By.xpath("//a[@href='https://pos.aksharatraining.in/pos/public/items']")).click();
		//driver.findElement(By.xpath("//a[@href='https://pos.aksharatraining.in/pos/public/items']")).click();
		//driver.findElement(By.xpath(""));)

	}

}
