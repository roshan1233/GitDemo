package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample12.html");
		WebElement element = driver.findElement(By.xpath("//select[@id='A1']"));
		Thread.sleep(2000);

		Select select = new Select(element);
		Thread.sleep(2000);

		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByValue("b");
		select.selectByVisibleText("Delhi");
		
		List<WebElement> text = select.getOptions();
		for(WebElement e:text)
		{
			System.out.println(e.getText());
		}
		
		System.out.println(select.getWrappedElement().getText());
		
		System.out.println(select.isMultiple());
	}

}
