package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);//int index of the frame
		driver.findElement(By.id("t2")).sendKeys("A");
	
		
		driver.switchTo().defaultContent();//exit from the frame
		driver.findElement(By.id("t1")).sendKeys("A");
		
		driver.switchTo().frame("f1");//String- using id 
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().defaultContent();//exit from the frame
		driver.findElement(By.id("t1")).sendKeys("B");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='n1']"));
		driver.switchTo().frame(frameElement);//WebElement- element of the frame
		driver.findElement(By.id("t2")).sendKeys("C");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("C");
		
		
		
	}
}
