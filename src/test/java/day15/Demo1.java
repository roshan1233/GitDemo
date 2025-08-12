package day15;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
//if we try to perform any action on the closed browser we get NoSuchWindowException
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
	
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		
		driver.close();
		System.out.println(driver.getTitle());
		//driver.quit();
		
		

	}

}