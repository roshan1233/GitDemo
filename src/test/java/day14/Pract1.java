package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Awanish");

	}

}
