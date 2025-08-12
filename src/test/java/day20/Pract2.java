package day20;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GooglePage1
{
	
	@FindBy(xpath="//a")
	private List<WebElement> link;
	
	GooglePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	
	public void allLinks()
	{
		int count = link.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(link.get(i).getText());
		}
	}
	
}

public class Pract2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		GooglePage1 page = new GooglePage1(driver);
		page.allLinks();

	}

}
