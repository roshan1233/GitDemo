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

public class Pract1 {
// to take screenshot of an element
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//span[text()='India’s Premier Test Automation training Center']"));
		File srcFile = e.getScreenshotAs(OutputType.FILE);
		File dFile = new File("./images/a1.png");
		FileUtils.copyFile(srcFile, dFile);

	}

}
