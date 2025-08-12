package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample4.html");
		
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		
		for(WebElement e:elements)
		{
			e.sendKeys("Hi");
		}

	}

}
