package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract13 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://aksharatraining.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i=0;i<7;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./images/Demo"+i+".png");
			FileUtils.copyFile(srcFile, destFile);
		}

	}

}
