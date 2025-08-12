package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D://Java//Workspace//pages/sample6.html");
		
		
		WebElement java = driver.findElement(By.xpath("//td[text()='Java']"));
		WebElement cost1 = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(java));
		System.out.println(cost1.getText());
		
		WebElement cost2 = driver.findElement(with(By.tagName("td")).toRightOf(By.xpath("//td[text()='Java']")));
		System.out.println(cost2.getText());
		
		driver.quit();
	}
}















