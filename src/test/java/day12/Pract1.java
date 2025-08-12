package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("(//a[text()='Free Ebooks'])[1]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Free Deep Learning eBooks']")).click();
		//actions.moveToElement(element1).perform();
		//Thread.sleep(2000);


	}

}
