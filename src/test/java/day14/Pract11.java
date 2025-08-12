package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a"));
		driver.findElement(By.id("APjFqb"));
	}

}
