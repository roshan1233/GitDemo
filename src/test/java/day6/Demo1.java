package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Java\\Workspace\\pages/sample2.html");
		
		driver.findElement(By.xpath("./html/body/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/a")).click();
	}

}
