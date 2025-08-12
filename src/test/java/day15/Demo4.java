package day15;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	//open FB and open google in 2 diff browser-done -below code
	//open FB in 1st tab and open google in 2nd tab-possible in selenium 4
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.WINDOW);//opens new window & it will switch to it
		driver.manage().window().setPosition(new Point(500, 10));
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.quit();
		Thread.sleep(1000);
		
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);//opens new TAB & it will switch to it
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.quit();
	}

}
