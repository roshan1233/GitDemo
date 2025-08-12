package day20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Sample9
{
	private WebDriver driver;
	
	@FindBy(id="A1")
	private WebElement submit;
	
	Sample9(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	void clickSubmit()
	{
		submit.click();
	}
	
	void handelAlert()
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
public class Demo6 {
//How do u handle alert pop-up in POM
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Java/Workspace/pages/sample9.html?");
		
		Sample9 s=new Sample9(driver);
		s.clickSubmit();
		
		s.handelAlert();
	
		driver.quit();
	}

}
