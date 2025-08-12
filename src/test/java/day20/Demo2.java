package day20;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//invalid login
	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://pos.aksharatraining.in/pos/public/");
			
			LoginPage loginpage=new LoginPage(driver);
			loginpage.setUserName("admin123");
			loginpage.setPassword("pointofsale123");
			loginpage.clickGoButton();
			
			Thread.sleep(1000);
			
			loginpage.setUserName("admin");
			loginpage.setPassword("pointofsale");
			loginpage.clickGoButton();
			
			HomePage homepage=new HomePage(driver);
			homepage.clickLogout();
			
			driver.quit();
		}


}
