package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("D:\\Java\\Workspace\\pages/sample3.html");
		driver.findElement(By.xpath("/html/body/a")).click();
		
		goBack(driver);
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		
		goBack(driver);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		
		goBack(driver);
	}

	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	}

}
