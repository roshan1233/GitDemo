package day23;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void testA() throws MalformedURLException
	{
		String OndemandURL="https://oauth-anandawanish7-b9676:b57f3658-8b25-4532-a878-169909fffb70@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
		
//		WebDriver driver=new ChromeDriver();//open chrome browser in local system
		
		URL gridURL=new URL(OndemandURL);
		ChromeOptions options=new ChromeOptions();
		
		WebDriver driver=new RemoteWebDriver(gridURL, options);//open chrome browser in remote system
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
		for(int i=1;i<=10;i++)
		{
		
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys("admin");
		
		}
		
		driver.quit();
	}
}