package day12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
//Alert popup
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample9.html?");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("A1")).click();
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		
		
		
		System.out.println(alert.getText());
		
		alert.accept(); //click OK
		
//		alert.dismiss();//click cancel
		
		
		
		
		
		
		
	}

}