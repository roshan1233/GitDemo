package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Duration time = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(time);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin12");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			System.out.println("Pass:Home Page is dsplayed");
		}
		else
		{
			System.out.println("Fail:Home Page is not dsplayed");
		}
	}

}
