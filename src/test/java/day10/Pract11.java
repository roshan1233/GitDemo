package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample8.html");
		
		driver.findElement(By.id("A1")).clear();
		
		System.out.println(driver.findElement(By.id("A1")).isEnabled());
		
		boolean b = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(b);
		
		System.out.println(driver.findElement(By.id("A5")).isSelected());
		
		System.out.println(driver.findElement(By.id("A5")).isDisplayed());
		
		System.out.println(driver.findElement(By.id("A3")).isDisplayed());

		System.out.println(driver.findElement(By.id("A5")).getTagName());
		
		System.out.println(driver.findElement(By.id("A2")).getAttribute("id"));
		System.out.println(driver.findElement(By.id("A2")).getLocation().getX());
		
		System.out.println(driver.findElement(By.id("A2")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("A2")).getSize().getWidth());
		
		System.out.println(driver.findElement(By.id("A2")).getCssValue("color"));




	}

}
