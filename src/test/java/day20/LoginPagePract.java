package day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePract {
	
	//private WebElement driver;
		@FindBy(id="input-username")
		private WebElement unTB;
		
		@FindBy(id="input-password")
		private WebElement pwd;
		
		@FindBy(name="login-button")
		private WebElement goButton;
		
		LoginPagePract(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void sendUname()
		{
			unTB.sendKeys("admin");
		}
		public void sendPwd()
		{
			pwd.sendKeys("pointofsale");
		}
		
		public void goButton()
		{
			goButton.click();
		}

	

}
