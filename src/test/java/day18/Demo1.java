package day18;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
		Thread.sleep(2000);
		
		driver.get("file:///D:/Java/Workspace/pages/sample14.html");
		System.out.println("Page is loaded");
		
		WebElement button = driver.findElement(By.id("myButton"));
		System.out.println("Button is found");
		
		wait.until(ExpectedConditions.elementToBeClickable(button));
		System.out.println("Button is enabled");
		
		button.click();
		System.out.println("Button is clicked");
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("alert popup");
		
		System.out.println(alert.getText());
		
		alert.accept();
		System.out.println("Clicked ok on Alert");

	}

}