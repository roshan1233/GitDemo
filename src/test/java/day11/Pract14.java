package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract14 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://aksharatraining.com/");
		
		driver.findElement(By.id("A1"));
		
		Actions action = new Actions(driver);
		for(int i=0;i<7;i++)
		{
			action.scrollByAmount(0, 500).perform();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./images/ab"+i+".png");
			FileUtils.copyFile(srcFile, destFile);
		}

	}

}
