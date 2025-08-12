package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		
		WebElement element = driver.findElement(By.xpath("//input[@type='button']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();

	}

}
