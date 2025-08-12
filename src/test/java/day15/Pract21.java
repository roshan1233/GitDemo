package day15;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract21 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String parent = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		//handles.remove(parent);
		
		for(String h:handles)
		{
			driver.switchTo().window(h);
			if(driver.getTitle().equalsIgnoreCase("OrangeHRM HR Software | OrangeHRM"))
			{
				driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
				driver.close();
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
			}
			
			//System.out.println(driver.getTitle());
			
		}
	}

}
