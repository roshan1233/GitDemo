package day19b;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//invalid login
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://pos.aksharatraining.in/pos/public/");
			
			LoginPage loginpage=new LoginPage(driver);
			loginpage.setUserName("admin123");
			loginpage.setPassword("pointofsale123");
			loginpage.clickGoButton();
			
			
			//driver.quit();
		}


}
