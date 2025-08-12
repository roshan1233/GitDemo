package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		Actions a = new Actions(driver);
		TakesScreenshot t = (TakesScreenshot) driver;
		for(int i=0;i<7;i++)
		{
			a.scrollByAmount(0, 1000).perform();
			Thread.sleep(1500);
			File src = t.getScreenshotAs(OutputType.FILE);
			File dest = new File("./images/b"+i+".png");
			FileUtils.copyFile(src, dest);
			Thread.sleep(1500);

		}

	}

}
