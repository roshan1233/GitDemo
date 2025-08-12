package day20;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Example for POM class
class MyPage
{
	//declaration
	@FindBy(id="input-username")
	private WebElement unTB;
	
	
	//utilization
	void setUN() {
		unTB.sendKeys("admin");
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		MyPage page=new MyPage();
		PageFactory.initElements(driver, page);
		page.setUN();

	}

}
