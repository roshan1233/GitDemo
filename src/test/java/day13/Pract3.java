package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		driver.findElement(By.id("A3")).click();
		
		driver.findElement(By.id("PageLink_5")).click();
		
		driver.findElement(By.id("DirectLink_13")).click();

	}

}
