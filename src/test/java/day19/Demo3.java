package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class B
{
	//declaration
	private WebElement unTB;
	
	//initialization
	B(WebDriver  driver)
	{
		unTB = driver.findElement(By.id("input-username")); 
	}
	
	//utilization
	void set()
	{
		unTB.sendKeys("admin");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		B b1=new B(driver);
		b1.set();
	}

}
