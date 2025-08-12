package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> element = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		int count =element.size();
		
		for(int i=0;i<element.size();i++)
		{
//			String text = element.get(i).getText();
//			System.out.println(text);
		}
		
//		element.get(count-1).click();
		
		for(int i=0;i<count;i++)
		{
			if(element.get(i).getText().contains("foods"))
			{
				element.get(i).click();
			}

		}

//		for(WebElement e:element)
//		{
//			System.out.println(e.getText());
//		}
//		System.out.println("----------");
//		System.out.println(element.get(1).getText());
//		System.out.println(element.getFirst().getText());
//		
//		System.out.println("----last-----");
//		System.out.println(element.get(count-1).getText());
//		System.out.println(element.getLast().getText());
	}

}
