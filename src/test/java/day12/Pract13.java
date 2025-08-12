package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract13 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement element1 = driver.findElement(By.id("block-1"));
		
		WebElement element2 = driver.findElement(By.id("block-3"));
		
		Actions action = new Actions(driver);

		action.clickAndHold(element1).moveToElement(element2).release().perform();
	}

}
