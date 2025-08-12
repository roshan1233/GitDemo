package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample13.html");
		
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		int count=select.getOptions().size();
		//select all
		for(int i=0;i<count;i++)
		{
			select.selectByIndex(i);
		}
		
		//deselect all without using deselectAll method
		
		for(int i=0;i<count;i++)
		{
			select.deselectByIndex(i);
		}
		
	}

}