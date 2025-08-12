package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	
	
	public static void goBack(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\\\Java\\\\Workspace\\\\pages/sample2.html");
		
		driver.findElement(By.linkText("Google")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("Go")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("oo")).click();
		
		goBack(driver);
//		
//		driver.findElement(By.partialLinkText("Ge")).click();
	}
	
	

}
