package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='off' and @type='text' and not (@title='Search for Products, Brands and More')]")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();

	}

}
