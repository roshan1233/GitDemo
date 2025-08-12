package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Demo6 {

	public static void main(String[] args) {
		 	FirefoxProfile profile = new FirefoxProfile();
	        profile.setPreference("dom.webnotifications.enabled", false);

	       
	        FirefoxOptions options = new FirefoxOptions();
	        options.setProfile(profile);

	        WebDriver driver = new FirefoxDriver(options);
	        driver.get("https://irctc.co.in/");
	        
	}
}
