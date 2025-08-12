	package day23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void testA() throws MalformedURLException
	{
		String OndemandURL="https://oauth-anandawanish7-9b204:de5956f3-0b05-4169-981b-6aac22fc324c@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
		
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Linux");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("name", "Test1");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL gridURL=new URL(OndemandURL);
		
		WebDriver driver=new RemoteWebDriver(gridURL, browserOptions);
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
		for(int i=1;i<=10;i++)
		{
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys("admin");
		}
		
		driver.quit();
	}
}