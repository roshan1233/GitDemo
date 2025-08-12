package day20;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//How to handle multiple elements using POM
class GooglePage
{
	@FindBy(xpath="//a")
	private WebElement firstLink;  //driver.findElement
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;//driver.findElements
	
	GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	void printLinkDetails()
	{
		System.out.println(firstLink.getText());
		
		int count = allLinks.size();
		System.out.println(count);
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		GooglePage g=new GooglePage(driver);
		g.printLinkDetails();
		driver.quit();

	}

}
