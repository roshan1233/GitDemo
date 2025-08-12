package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
		@FindBy(id="input-username")
		private WebElement unTB;
		
		@FindBy(id="input-password")
		private WebElement pwTB;
		
		@FindBy(name="login-button")
		private WebElement goBTN;
		
		//initialization
		LoginPage(WebDriver  driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		void setUserName(String un)
		{
			unTB.sendKeys(un);
		}
		
		void setPassword(String pw) 
		{
			pwTB.sendKeys(pw);
		}
		
		void clickGoButton() {
			goBTN.click();
		}
}
