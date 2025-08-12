package day13;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File f=new File("./CV/MYCV.docx");
		String absolutepath = f.getAbsolutePath();
		
		driver.findElement(By.id("A2")).sendKeys(absolutepath);
				
		
		
		
		
		
	}

}
