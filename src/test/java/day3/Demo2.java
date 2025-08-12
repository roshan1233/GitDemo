package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		
		Dimension d=new Dimension(500, 600);
		driver.manage().window().setSize(d); //resize 
		
		size = driver.manage().window().getSize();
		System.out.println(size);
		
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		
		Thread.sleep(2000);
		p=new Point(500, 10);
		driver.manage().window().setPosition(p); //move the browser
		
		System.out.println(driver.manage().window().getPosition());
	}

}
