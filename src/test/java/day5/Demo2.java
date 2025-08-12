package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\\\Java\\\\Workspace\\\\pages/sample4.html");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Awanish");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Anand");
		

	}

}
