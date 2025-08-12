package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.switchTo().activeElement().sendKeys("bhanu");
		driver.findElement(By.xpath("//input[@type='text' and not(@name='q')]")).sendKeys("bhanu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
	}
}
