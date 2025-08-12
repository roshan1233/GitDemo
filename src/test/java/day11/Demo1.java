package day11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.name("login-button"));
		File srcFile = button.getScreenshotAs(OutputType.FILE);
		File dstFile=  new File("./images/gobutton.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
	}

}
