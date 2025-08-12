package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@data-cy='guest']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[text()='Rooms']/../..//span[@class='gstSlct__text']")).click();
	}

}
