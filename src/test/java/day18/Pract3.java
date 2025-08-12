package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Pract3 {

	public static void main(String[] args) {
		//custom wait
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
			
			for(int i=0;i<50;i++)
			{
				try {
					driver.findElement(By.name("username")).sendKeys("Admin");
					System.out.println("Found");
					break;
				}
				catch(Exception e)
				{
					System.out.println("Not found"+i);
				}
				
			}
			
	}

}
