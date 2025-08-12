package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///D:/Java/Workspace/pages/sample12.html");
		
		WebElement listBox = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(listBox);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
		
		for(int i=0;i<size;i++)
		{
			select.selectByIndex(i);
		}
		
		
//		driver.findElement(By.xpath("//option[@value='b']")).click();

	}

}
