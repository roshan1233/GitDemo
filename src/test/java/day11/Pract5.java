package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Pract5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span[text()='Learn More ']"));
		
		System.out.println(element.getSize().getHeight());
		System.out.println(element.getSize().getWidth());

		System.out.println(element.getAttribute("class"));
		System.out.println(element.getCssValue("background-color"));
		System.out.println(Color.fromString(element.getCssValue("background-color")).asHex());
		
		System.out.println(element.getLocation().getX());
		System.out.println(element.getLocation().getY());
		
		System.out.println(element.getRect().getHeight());
	}

}
