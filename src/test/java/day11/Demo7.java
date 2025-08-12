package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//how to scroll the page without using JSE? --->Actions
public class Demo7 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		
		for(int i=1;i<=5;i++)
		{
			actions.scrollByAmount(0, 500).perform();
			Thread.sleep(1000);
		}	
		
	}

}
