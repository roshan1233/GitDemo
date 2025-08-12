package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Java\\Workspace\\pages/sample8.html");
		
		
		
		
		Thread.sleep(2000);	
		driver.findElement(By.id("A1")).clear();
		
		driver.findElement(By.id("A1")).sendKeys("Abcd");
		
		driver.findElement(By.id("A7")).click();
		
		System.out.println(driver.findElement(By.id("A4")).isEnabled());
		
		System.out.println(driver.findElement(By.id("A5")).isSelected());
		
		System.out.println(driver.findElement(By.id("A3")).isDisplayed());
		
		driver.findElement(By.id("A8")).submit();
		
		
//		
//		driver.findElement(By.id("A2")).click();
	}

}
