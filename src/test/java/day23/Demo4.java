package day23;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
//cmd--> java -jar selenium-server-4.15.0.jar standalone
	@Test
	public void test() throws MalformedURLException
	{
		URL gridURL=new URL("http://192.168.29.139:4444");
		ChromeOptions browserOptions=new ChromeOptions();  
		WebDriver driver=new RemoteWebDriver(gridURL,browserOptions);
		driver.get("http://www.google.com");
		Reporter.log(driver.getTitle(),true);
		driver.quit();
	}
}
