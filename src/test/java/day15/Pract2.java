package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		//open FB and open google in 2 diff browser
		//open FB in 1st tab and open google in 2nd tab-not possible in selenium 3
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://fb.com");
//		Thread.sleep(3000);
//		WebDriver driver2 = new ChromeDriver();
//		driver2.get("https://google.com");
		
		driver.get("https://fb.com");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		driver.quit();
		
		driver=new ChromeDriver();
		driver.get("https://fb.com");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");

	}

}
