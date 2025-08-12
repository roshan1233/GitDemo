package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///D:/Java/Workspace/pages/sample13.html");
		
		WebElement element = driver.findElement(By.id("A2"));
		Select select = new Select(element); 
		List<WebElement> options = select.getOptions();
		int size = options.size();
		
		for(int i=0;i<size;i++)
		{
			Thread.sleep(1000);
			select.selectByIndex(i);
			
		System.out.println(options.get(i).getText());
		}
		
		for(int i=0;i<size;i++)
		{
			Thread.sleep(1000);
			select.deselectByIndex(i);
		}
		
		for(WebElement e:options)
		{
			
			System.out.println(select.getWrappedElement().getText());
		}

	}

}
