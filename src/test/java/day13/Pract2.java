package day13;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		
		File f = new File("./cv/MYCV.docx");
		String path = f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.id("A2")).sendKeys(path);
	}
}
