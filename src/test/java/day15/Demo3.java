package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	//open FB and open google in 2 diff browser
	//open FB in 1st tab and open google in 2nd tab-not possible in selenium 3
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		
		WebDriver driver2=new ChromeDriver();
		driver2.get("http://www.google.com");
		
		
	}

}
