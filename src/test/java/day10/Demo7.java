package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//verify that password is below username
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		WebElement unTB = driver.findElement(By.id("input-username"));
		
		int h = unTB.getSize().getHeight();
		System.out.println(h);
		
		int w = unTB.getSize().getWidth();
		System.out.println(w);
		
		int x=unTB.getLocation().getX();
		System.out.println(x);
		
		int y=unTB.getLocation().getY();
		System.out.println(y);
		
		h=unTB.getRect().getHeight();
		System.out.println(h);
		w=unTB.getRect().getWidth();
		System.out.println(w);
		x=unTB.getRect().getX();
		System.out.println(x);
		y=unTB.getRect().getY();
		System.out.println(y);
		
		driver.quit();

	}

}
