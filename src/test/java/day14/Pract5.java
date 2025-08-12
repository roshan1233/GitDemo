package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String parent=driver.getWindowHandle();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		driver.findElement(By.id("A5")).click();
		
		Set<String> handles = driver.getWindowHandles();
		handles.remove(parent);
		
		for(String h:handles)
		{
			driver.switchTo().window(h);
			System.out.println(h);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Good");
		}

	}

}
