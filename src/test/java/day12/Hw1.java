package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//a[text()='Tester’s Hub']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element1).perform();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Demo Testing Site']"));
		action.moveToElement(element2).perform();
		Thread.sleep(2000);
	}

}
