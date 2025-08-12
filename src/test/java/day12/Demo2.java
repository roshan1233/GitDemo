package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
//double click
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		String before=driver.findElement(By.id("box")).getText();
		System.out.println(before);
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Double Click']"));
		
		Actions actions=new Actions(driver);
		actions.doubleClick(button).perform();
	
		
		String after=driver.findElement(By.id("box")).getText();
		System.out.println(after);
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}