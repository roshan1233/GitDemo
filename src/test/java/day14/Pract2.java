package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		try {
			driver.switchTo().frame(2);
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			System.out.println("No ads present on screen");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		boolean selectedDate=false;
		
		for(int i=1;i<=11;i++)
		{
			try
			{
				driver.findElement(By.xpath("//div[text()='August 2024']/../..//p[text()='19']")).click();
				System.out.println("Date Found");
				selectedDate=true;
				break;				
			}
			catch(Exception e)
			{
				System.out.println("Date not found");	
				driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
			}
		}
		
		if(selectedDate)
		{
			System.out.println("Given date Found");
		}
		else
		{
			System.out.println("Given date not found");
		}
	}

}
