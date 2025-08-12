package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		
		driver.findElement(By.id("A2")).sendKeys("C:\\\\Users\\\\DELL\\\\Documents/MYCV.docx");
//		driver.switchTo().activeElement();
//		driver.findElement(By.)

	}

}
