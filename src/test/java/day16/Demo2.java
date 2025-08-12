package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		
		List<WebElement> allASE = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int count= allASE.size();
		System.out.println(count);
		
//		for(int i=0;i<count;i++)
//		{
//			WebElement ASE = allASE.get(i);
//			String text= ASE.getText();
//			System.out.println(text);
//		}
		
		for(WebElement ASE:allASE)
		{
			String text=ASE.getText();
			System.out.println(text);
		}
		
		//select the 1st auto suggestion
//		allASE.get(0).click();
		
		//select 3rd
//		allASE.get(2).click();
		
		//select last one
//		allASE.get(count-1).click();
		
//		for(WebElement ASE:allASE)
//		{
//			String text=ASE.getText();
//			if(text.contains("rich"))
//			{
//				ASE.click();
//				break;
//			}
//		}
		
		
	}

}