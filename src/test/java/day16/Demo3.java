package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample12.html");
		WebElement listBox = driver.findElement(By.id("A1"));
		
		Select select=new Select(listBox);
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("c");
		Thread.sleep(1000);
		select.selectByVisibleText("Delhi");

		//Note: if any of the arg is invalid we get NSEE
	}

}