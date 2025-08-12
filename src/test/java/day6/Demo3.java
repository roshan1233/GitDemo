package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("D:\\Java\\Workspace\\pages/sample4.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Admin123");

	}

}
