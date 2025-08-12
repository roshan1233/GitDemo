package day20;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
		
		LoginPagePract login = new LoginPagePract(driver);
		login.sendUname();
		login.sendPwd();
		login.goButton();

		HomePagePract home = new HomePagePract(driver);
		home.logoutButton();
		
		LoginPagePract login1 = new LoginPagePract(driver);
		login1.sendUname();
		login1.sendPwd();
		login1.goButton();
	}

}
