package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract22 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///D:/Java/Workspace/pages/sample13.html");
		
//		WebElement listBox = driver.findElement(By.xpath("//select[@id='A2']"));
//		
//		Select select = new Select(listBox);
//		List<WebElement> options = select.getOptions();
//		System.out.println(options.size());
//		System.out.println(select.getWrappedElement().getText());
//		
//		for(int i=0;i<options.size();i++)
//		{
//			select.selectByIndex(i);
//		}
//		
//		for(int i=0;i<options.size();i++)
//		{
//			select.deselectByIndex(i);
//		}
//		
//		

	}

}
