package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Hw2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/login");
		
		driver.findElement(By.id("input-username")).sendKeys("1Admin");
		driver.findElement(By.id("input-password")).sendKeys("Admin123");
		driver.findElement(By.name("login-button")).click();
		
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='error']"));
		String msg=errorMsg.getText();
		System.out.println(msg);
		
		int h=errorMsg.getSize().getHeight();
		System.out.println("Height is :"+h);
		
		int w=errorMsg.getSize().getWidth();
		System.out.println("Width is:"+w);
		
		System.out.println("h is :"+errorMsg.getRect().getHeight());
		System.out.println("w is :"+errorMsg.getRect().getWidth());
		System.out.println("p is"+errorMsg.getRect().getPoint());
		System.out.println("x is"+errorMsg.getRect().getX());
		System.out.println("y is"+errorMsg.getRect().getY());
		Boolean b=errorMsg.isDisplayed();
		System.out.println("Result is :"+b);
		
		
		//check with sir, how to match whether the color is same or not
		String Colour = errorMsg.getCssValue("color");
		System.out.println("Colour "+Colour);
		
		String hexColor = Color.fromString(Colour).asHex();
		System.out.println("hexColor :"+hexColor);
		
		String bgColor = errorMsg.getCssValue("background-color");
		System.out.println("bgColor :"+bgColor);
		String hexBgColor = Color.fromString(bgColor).asHex();
		System.out.println("hexBgColor :"+hexBgColor);
		

	}

}
