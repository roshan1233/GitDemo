package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		
		driver.findElement(By.id("input-username")).sendKeys("Admin");
		driver.findElement(By.id("input-password")).sendKeys("pointofsale");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
