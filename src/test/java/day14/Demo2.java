package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		try {
			//driver.switchTo().frame(2);
			driver.findElement(By.xpath("//div[@id='root']//span[@data-cy='closeModal']")).click();
			//driver.switchTo().defaultContent();
		}
		catch (Exception e)
		{
			System.out.println("No AD today");
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		Thread.sleep(1000);
		
		boolean dateSelected=false;
		
		for(int i=1;i<=11;i++)
		{
			
			try 
			{
				driver.findElement(By.xpath("//div[text()='April 2025']/../..//p[text()='25']")).click();
				dateSelected=true;
				break;
			}
			
			catch (Exception e) 
			{
				System.out.println("Date not found , hence clicking Next");
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(1000);
			}
			
			
		}
		
		
		if(dateSelected)
		{
			System.out.println("Given date is selected");
		}
		else
		{
			System.out.println("Unable to selected the date, please check");
		}
		
		
	}

}