package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		
		WebElement element = driver.findElement(By.xpath("//input[@value=\"Double Click\"]"));
		
		WebElement element0 = driver.findElement(By.xpath("//div[@id='box']"));
		String before = element0.getText();
		System.out.println(before);
		System.out.println(element0.getCssValue("background-color"));
		
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
		Thread.sleep(2000);
				
		WebElement element1 = driver.findElement(By.xpath("//div[@id='box']"));
		String after = element1.getText();
		System.out.println(after);
		
		String bgcolor = element1.getCssValue("background-color");
		System.out.println(bgcolor);

	}

}
