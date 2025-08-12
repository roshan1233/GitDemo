package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample13.html");
		
		WebElement listBox = driver.findElement(By.id("A3"));
		Select select=new Select(listBox);
		
		//get all the options present in MSLB
		System.out.println("--ALL OPTIONS----");
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		
		System.out.println("------");
		System.out.println(select.getWrappedElement().getText());//without loop
		System.out.println("--Only SELECTED options----");
		
		allOptions=select.getAllSelectedOptions();
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		System.out.println("------");
		System.out.println(select.getFirstSelectedOption().getText());
		
		driver.quit();
		
	}

}