package day15;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String parent = driver.getWindowHandle();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		allHandles.remove(parent);
		
		for(String b:allHandles)
		{
			driver.switchTo().window(b);
			driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
		}

	}

}
