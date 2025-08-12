package day18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		Duration scriptTime = driver.manage().timeouts().getScriptTimeout();
//		System.out.println(scriptTime);
		
		driver.get("https://irctc.co.in/");
	}

}
