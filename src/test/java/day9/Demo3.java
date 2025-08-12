package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;



public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D://Java//Workspace//pages/sample6.html");
		
		WebElement java = driver.findElement(By.xpath("//td[text()='Java']"));
		WebElement cost = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(java));
		System.out.println(cost.getText());
		
		WebElement slno = driver.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(java));
		System.out.println(slno.getText());
		
		WebElement header= driver.findElement(RelativeLocator.with(By.tagName("th")).above(java));
		System.out.println(header.getText());
		
		WebElement sub=driver.findElement(RelativeLocator.with(By.tagName("td")).below(java));
		System.out.println(sub.getText());
		
		WebElement n=driver.findElement(RelativeLocator.with(By.tagName("th")).near(java));
		System.out.println(n.getText());
	}
}
