package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage
{
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

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.setUserName("admin");
		loginpage.setPassword("pointofsale");
		loginpage.clickGoButton();
	}

}
