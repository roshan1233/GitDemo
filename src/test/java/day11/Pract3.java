package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j =(JavascriptExecutor) driver;
		TakesScreenshot t = (TakesScreenshot) driver;
		for(int i=0;i<7;i++)
		{
		//JavascriptExecutor j =(JavascriptExecutor) driver;
		j.executeScript("scrollBy(0,1000)");
		Thread.sleep(2000);
		//TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./images/a"+i+".png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(1000);
		}
	}

}
