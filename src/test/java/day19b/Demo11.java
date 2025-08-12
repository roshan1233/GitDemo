package day19b;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://pos.aksharatraining.in/pos/public/");
			
			WebElement unTB;
			//1. FE  2. action 3. refresh
//			unTB = driver.findElement(By.id("input-username"));
//			unTB.sendKeys("admin");
//			driver.navigate().refresh();
			
			//1 refresh  2. FE   3. action
//			driver.navigate().refresh();
//			unTB = driver.findElement(By.id("input-username"));
//			unTB.sendKeys("admin");
			
			//1. FE 2.Refresh  3.Action
			unTB = driver.findElement(By.id("input-username"));
			unTB.sendKeys("admin");
			driver.navigate().refresh();
			unTB.sendKeys("admin");
		}


}
