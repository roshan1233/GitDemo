package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample13.html");
		WebElement element = driver.findElement(By.id("A2"));
		Thread.sleep(2000);

		Select options = new Select(element);
		
		options.selectByIndex(1);
		
		List<WebElement> text = options.getOptions();
		
		for(int i=0;i<text.size();i++)
		{
			options.selectByIndex(i);
		}
		
		for(int i=0;i<text.size();i++)
		{
			options.deselectByIndex(i);
		}

	}

}
