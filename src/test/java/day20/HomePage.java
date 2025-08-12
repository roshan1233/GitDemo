package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
		@FindBy(xpath = "//a[text()='Logout']")
		private WebElement logout;
		
		//initialization
		
		HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		
		void clickLogout()
		{
			logout.click();
		}
}
