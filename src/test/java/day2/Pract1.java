package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pract1 {
	
	public static void browser(WebDriver driver) throws InterruptedException, MalformedURLException
	{
		driver.get("https://gmail.com");
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getTitle();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();

		driver.navigate().to("https://fb.com");
		URL url = new URL("https://google.com");
		driver.navigate().to(url);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		browser(driver);
		
		WebDriver driver1 = new EdgeDriver();
		browser(driver1);
		
		WebDriver driver2 = new FirefoxDriver();
		browser(driver2);
	}

}
