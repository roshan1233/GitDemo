package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement element1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement element2 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(element1).moveToElement(element2).pause(Duration.ofSeconds(5)).release().perform();

	}

}
