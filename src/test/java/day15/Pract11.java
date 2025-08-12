package day15;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(3000);

		Set<String> allBrowsers = driver.getWindowHandles();
		//allBrowsers.remove(parent);
		
		for(String b:allBrowsers)
		{
			driver.switchTo().window(b);
			if(driver.getTitle().equalsIgnoreCase("OrangeHRM HR Software | OrangeHRM"))
			{
				driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
			}
			
		}

	}

}
