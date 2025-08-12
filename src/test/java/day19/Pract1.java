package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginPage1
{
	private WebElement uName;
	private WebElement pwd;
	private WebElement goButton;

	LoginPage1(WebDriver driver)
	{
		uName=driver.findElement(By.id("input-username"));
		pwd=driver.findElement(By.id("input-password"));
		goButton=driver.findElement(By.name("login-button"));	
	}
	
	public void sendUname()
	{
		uName.sendKeys("admin");
	}
	public void sendpwd()
	{
		pwd.sendKeys("pointofsale");
	}
	public void clickGoButton()
	{
		goButton.click();
	}

}

class HomePage1
{
	private WebElement logout;
	
	HomePage1(WebDriver driver)
	{
		logout=driver.findElement(By.xpath("//a[text()='Logout']"));
	}
	
	public void clickLogout()
	{
		logout.click();
	}
	
}
public class Pract1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://pos.aksharatraining.in/pos/public/");
		
		LoginPage1 page = new LoginPage1(driver);
		page.sendUname();
		page.sendpwd();
		page.clickGoButton();
		
		HomePage1 homepage = new HomePage1(driver);
		homepage.clickLogout();
		
		LoginPage1 page1 = new LoginPage1(driver);
		page1.sendUname();
		page1.sendpwd();
		page1.clickGoButton();
		
	}

}
