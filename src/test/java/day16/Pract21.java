package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract21 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///D:/Java/Workspace/pages/sample12.html");
		
		WebElement listBox = driver.findElement(By.id("A1"));
		
		Select select = new Select(listBox);
		List<WebElement> list = select.getOptions();
		
		System.out.println(list.size());
		System.out.println(select.getWrappedElement().getText());
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			list.get(i).click();
			
		}

	}

}
