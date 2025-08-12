package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		//read data
		String un=Excel.getData("./data/pos.xls","login", 1, 0);
		String pw=Excel.getData("./data/pos.xls","login", 1, 1);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}