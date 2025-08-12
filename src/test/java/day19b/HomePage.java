package day19b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	//declaration
		private WebElement logout;
		
		//initialization
		
		HomePage(WebDriver driver)
		{
			logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		}
		
		//utilization
		
		void clickLogout()
		{
			logout.click();
		}
}
