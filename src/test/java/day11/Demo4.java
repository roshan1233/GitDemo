package day11;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//how to run JS using selenium in the browser?
public class Demo4 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor) driver; //type casting
		j.executeScript("alert('Hi')");
		driver.quit();
		
	}

}
