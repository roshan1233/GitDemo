package day20;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Alert1
{
	private WebDriver driver;
	@FindBy(id="A1")
	private WebElement submit;
	
	Alert1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	void clickSubmit()
	{
		submit.click();
	}
	
	void handleAlert()
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}

public class Pract3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///D:/Java/Workspace/pages/sample9.html?");
		
		Alert1 alert = new Alert1(driver);
		alert.clickSubmit();
		alert.handleAlert();

	}

}
