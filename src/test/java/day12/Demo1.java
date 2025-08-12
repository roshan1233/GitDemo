package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Demo1 {
//mouse hover
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		WebElement menu = driver.findElement(By.xpath("(//a[text()='Free Ebooks'])[1]"));
		Thread.sleep(1000);
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Free Deep Learning eBooks']")).click();
	}

}