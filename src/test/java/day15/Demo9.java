package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample4.html");
		
		try {
		WebElement e = driver.findElement(By.tagName("output"));
		e.sendKeys("Hi");
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		List<WebElement> allTB = driver.findElements(By.tagName("output"));
		int count=allTB.size();
		System.out.println(count);//2
		
		
		

	}

}
