package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\\\Java\\\\Workspace\\\\pages/sample8.html");
		String v = driver.findElement(By.id("A1")).getAttribute("value");
		System.out.println(v);
		driver.quit();
		

	}

}
