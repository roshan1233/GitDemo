package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement element1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Paste']"));
		
		Actions action = new Actions(driver);
		action.contextClick(element1).perform();
		Thread.sleep(2000);
		
		action.moveToElement(element2).click().perform();

	}

}
