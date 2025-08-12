package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/#");
		Thread.sleep(2000);

		System.out.println("Title Before Login :"+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("pointofsale");
		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//img[@src='https://pos.aksharatraining.in/pos/public/images/menubar/customers.png']")).click();
		
		
		
		String expected="Powered by OSPOS";
		String actual=driver.getTitle();
		if(actual.contains(expected))
		{
			System.out.println("Pass : Home Page is displayed");
		}
		else
		{
			System.err.println("Fail : Home Page is not displayed");
		}
		driver.quit();

	}

}
