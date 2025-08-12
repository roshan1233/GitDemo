package day18;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pract1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("file:///D:/Java/Workspace/pages/sample14.html");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("myButton")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enabled!']\")")));
		driver.findElement(By.xpath("//button[text()='Enabled!']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
