package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<elements.size();i++)
		{
			 String text = elements.get(i).getText();
			 System.out.println(i+"---"+text);
		}
		for(WebElement e:elements)
		{
			//System.out.println(e.getText());
		}

	}

}
