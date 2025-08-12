package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Java\\Workspace\\pages/sample8.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).sendKeys("Akshara");
		Thread.sleep(1000);
		driver.findElement(By.id("A2")).click();//any type of element
		driver.quit();
		

	}

}