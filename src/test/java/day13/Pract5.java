package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample10.html");
		
		driver.findElement(By.id("t1")).sendKeys("asdfg");
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("125689");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("987654");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("t2")).sendKeys("987654");

	}

}
