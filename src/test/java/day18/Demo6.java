package day18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//verify whether page is loaded or not within 3s
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		Duration st = driver.manage().timeouts().getScriptTimeout();// used by java script executor
		System.out.println(st);
		
		Duration pageLoad = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(pageLoad);//5M
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
		try 
		{
			driver.get("https://irctc.co.in/");	
			System.out.println("Page is loaded within 3s");
		}
		catch (Exception e) {
			System.out.println("Page is Not loaded even after 3s");
		}
		
		

	}

}