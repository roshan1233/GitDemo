package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo3 {

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys("Awanish");
		
		//WebElement e1=driver.switchTo().activeElement();)
	}
}
