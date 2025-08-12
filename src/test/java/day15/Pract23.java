package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Pract23 {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifcations");
		driver.get("https://irctc.co.in");

	}

}
