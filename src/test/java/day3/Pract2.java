package day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://fb.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		WebElement ele=driver.switchTo().activeElement();
		ele.sendKeys("Admin");

		ele.sendKeys(Keys.TAB);
		WebElement ele1 = driver.switchTo().activeElement();
		ele1.sendKeys("123456");
		
		ele1.sendKeys(Keys.ENTER);
		//ele2=driver.switchTo().activeElement();
	}

}
