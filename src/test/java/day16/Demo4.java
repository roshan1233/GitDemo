package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample12.html");
		WebElement listBox = driver.findElement(By.id("A1"));
		
		Select select=new Select(listBox);

		//check if the listbox is multi select or single select
		System.out.println(select.isMultiple());//false -- single select listbox
		
		
		//print the content of the list box
		List<WebElement> allOptions = select.getOptions();//return all the options present in the list box
		int count=allOptions.size();
		System.out.println(count);
		
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		
		//print the content of the list box without using any looping statements
		WebElement a = select.getWrappedElement();
		System.out.println(a.getText());
	}

}