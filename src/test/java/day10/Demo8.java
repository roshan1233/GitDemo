package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		WebElement errMsg = driver.findElement(By.cssSelector(".error"));
		
		String tag=errMsg.getTagName();
		System.out.println(tag);

		String cls=errMsg.getAttribute("class");
		System.out.println(cls);
		
		String text=errMsg.getText();
		System.out.println(text);
		
		String c = errMsg.getCssValue("color");
		System.out.println("color "+c);//in RGB format
		String h = Color.fromString(c).asHex();
		System.out.println(h);//in hexa format
		
		System.out.println(errMsg.getCssValue("font-family"));
		
		System.out.println(errMsg.getCssValue("font-size"));
		
		String bc=driver.findElement(By.cssSelector("div.alert")).getCssValue("background-color");
		System.out.println(Color.fromString(bc).asHex());
		
		driver.quit();
		

	}

}
