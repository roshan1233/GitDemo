package day15;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		String parent=driver.getWindowHandle();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);
		Set<String> allWHS = driver.getWindowHandles();
		
		allWHS.remove(parent);
	
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
		}
		
		
		
		driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();

		driver.quit();
	}

}