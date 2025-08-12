package day14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size()); //3
		for(String w:allWHS)
		{
			System.out.println(w);
		}
		driver.quit();	
	}
}