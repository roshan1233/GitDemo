package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement element1 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement element2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(element1, element2).perform();
		Thread.sleep(2000);
		//clickAndHold(element1).pause(Duration.ofSeconds(2)).
	}

}
