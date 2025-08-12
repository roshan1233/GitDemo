package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("file:///D:/Java/Workspace/pages/sample9.html");
		
		driver.findElement(By.id("A2")).sendKeys("C:\\Users\\DELL\\Downloads//JHRC_2019_186033.pdf");
		
		driver.findElement(By.id("A3")).click();
		
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		
		driver.findElement(By.xpath("//a[@id='DirectLink_13']")).click();

	}

}
