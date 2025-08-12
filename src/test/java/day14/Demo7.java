package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//send item to specific browser ---> example Swara
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		String parent = driver.getWindowHandle();
		  
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		
		
		
		Set<String> allWHS = driver.getWindowHandles();
				
		for(String w:allWHS)
		{
			driver.switchTo().window(w);
			String title=driver.getTitle();
			if(title.equalsIgnoreCase("akshara")) {
				driver.findElement(By.id("t1")).sendKeys("Selenium");
				break;
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println("Done");
		
	
	}
}