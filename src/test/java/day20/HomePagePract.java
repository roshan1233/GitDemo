package day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePract {

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	HomePagePract(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutButton()
	{
		logout.click();
	}
}
