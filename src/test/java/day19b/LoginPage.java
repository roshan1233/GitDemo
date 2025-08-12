package day19b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//declaration
		private WebElement unTB;
		private WebElement pwTB;
		private WebElement goBTN;
		
		//initialization
		LoginPage(WebDriver  driver)
		{
			unTB = driver.findElement(By.id("input-username")); 
			pwTB = driver.findElement(By.id("input-password")); 
			goBTN = driver.findElement(By.name("login-button")); 
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
