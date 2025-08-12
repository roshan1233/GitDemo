package day18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract14 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Duration pageLoadTime = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(pageLoadTime);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		try {
			driver.get("https://irctc.co.in/");
			System.out.println("Page loaded");
		}
		catch(Exception e)
		{
			System.out.println("Page not loaded");
		}
		

	}

}
