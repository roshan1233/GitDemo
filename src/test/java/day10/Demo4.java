package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\\\Java\\\\Workspace\\\\pages/sample8.html");
		Thread.sleep(1000);
		boolean s1 = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(s1);//true--> element is enabled
		
		boolean s2 = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(s2);//false--> element id disabled
		Thread.sleep(1000);
		
		boolean s3 = driver.findElement(By.id("A5")).isSelected();//Check box, radio button, option in list box 
		System.out.println(s3);//true --> check box is selected
		
		boolean s4 = driver.findElement(By.id("A6")).isSelected();
		System.out.println(s4);//false --> check box is not selected
		
		boolean s5 = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(s5);//true---> element is displayed
		
		boolean s6 = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(s6);//false---> element is NOT displayed
		
		driver.quit();
		

	}

}
