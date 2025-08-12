package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
////verify that password is below username

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
		WebElement uname = driver.findElement(By.id("input-username"));
		WebElement pwd = driver.findElement(By.id("input-password"));
		
		int uxaxis = uname.getLocation().getX();
		System.out.println("UserNameXAxis "+uxaxis);
		int uyaxis = uname.getLocation().getY();
		System.out.println("UserNameYAxis "+uyaxis);

		int pxaxis = pwd.getLocation().getX();
		System.out.println("PasswordXAxis "+pxaxis);
		int pyaxis = pwd.getLocation().getY();
		System.out.println("PasswordYAxis "+pyaxis);

		System.out.println();
		System.out.println(uname.getAttribute("type"));
		
		if(pyaxis>uyaxis)
		{
			System.out.println("Password is below userName");
		}
		else
		{
			System.out.println("Password is above username");
		}
		driver.quit();

	}

}
