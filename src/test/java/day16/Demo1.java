package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement e = allLinks.get(i);
			String text= e.getText();
			System.out.println(i+"-"+text);//if the link is hidden or if there is no text for the link we get blank
		}
		
		driver.quit();

	}

}