package day15;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract22 {
	//open FB and open google in 2 diff browser-done -below code
	//open FB in 1st tab and open google in 2nd tab-possible in selenium 4
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://fb.com");
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://fb.com");
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getWindowHandle());
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String h:handles)
		{
				System.out.println(h);
				if(driver.switchTo().window(h).getTitle().equalsIgnoreCase("Google"))
				{
					List<WebElement> links = driver.findElements(By.xpath("//a"));
					for(WebElement link:links)
					{
						System.out.println(link.getText());
						
					}
				}
				
		}
		
		
	}

}
