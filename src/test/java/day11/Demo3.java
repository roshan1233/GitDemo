package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File dstFile=  new File("./images/Aksharapage.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
		
	}

}
