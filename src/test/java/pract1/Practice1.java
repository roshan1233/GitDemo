package pract1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("phone");
		
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(login).perform();
		
		//WebElement order = 
		driver.findElement(By.xpath("//li[text()='Orders']")).click();
		//action.moveToElement(order).click();
		
		
	}

}
