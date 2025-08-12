package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract13 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for(int i=0;i<11;i++)
		{
			try {
				if(driver.findElement(By.xpath("//div[text()='March 2024']")).getText().equalsIgnoreCase("March 2024"))
				{
					driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='19']")).click();
					break;
				}
			}
			
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				i++;
			}
		}
		
		
		
		
		
		

	}

}
