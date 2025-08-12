package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		String pBrowser=driver.getWindowHandle();
		//System.out.println(pBrowser);
		
		driver.manage().window().maximize();
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		
		driver.findElement(By.id("A5")).click();
		
		Set<String> allBrowsers = driver.getWindowHandles();
		for(String b:allBrowsers)
		{
			System.out.println(b);
			driver.switchTo().window(b);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("Akshara"))
			{
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Abcde");
			}
			
		}
		
		//driver.quit();
	}

}
