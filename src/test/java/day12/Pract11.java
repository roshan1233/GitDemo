package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/");
		
		WebElement element = driver.findElement(By.xpath("(//a[text()='Tester’s Hub'])[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='Demo Testing Site'])"));
		action.moveToElement(element2).perform();
		

	}

}
