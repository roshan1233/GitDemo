package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		Dimension d= new Dimension(200,200);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		Thread.sleep(2000);

		driver.manage().window().fullscreen();
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		
	}

}
