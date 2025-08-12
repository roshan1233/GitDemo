package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> text = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		System.out.println(text.size());
		
		for(int i=0;i<text.size();i++)
		{
			System.out.println(text.get(i).getText());
			
			if(text.get(i).getText().contains("200"))
			{
				text.get(i).click();
			}
		}
		

	}

}
