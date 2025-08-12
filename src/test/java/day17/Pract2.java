package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pos.aksharatraining.in/pos/public/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("pointofsale");
		
		driver.findElement(By.name("login-button")).submit();
		
		try {
		driver.findElement(By.xpath("//a[text()='Logout']"));
		System.out.println("Pass : Home Page is displayed");
			try {
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				try {
					driver.findElement(By.xpath("//h3[text()='Welcome to OSPOS!']"));
					System.out.println("Pass : Logged out of application");
				}
				catch(Exception e)
				{
					System.out.println("Failed");
				}
			}
			catch(Exception e)
			{
				System.out.println("Failed: Coudn't get logout");
			}
		}
		catch(Exception e)
		{
			System.out.println("Fail : Home page is not displayed");
		}
		
		
		
	

	}

}
