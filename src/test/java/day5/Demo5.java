package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
//https://pos.aksharatraining.in/pos/public/
	//username admin
	//password: pointofsale
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter url & maximize
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//enter un
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		//enter pw
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
