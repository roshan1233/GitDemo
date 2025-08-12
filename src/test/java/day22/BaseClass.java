package day22;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeClass
	public void openApp()
	{
		Reporter.log("@BeforeClass",true);
	}
	
	@AfterClass
	public void closeApp()
	{
		Reporter.log("@AfterClass",true);
	}
	@BeforeMethod//executes before every test method
	public void login()
	{
		Reporter.log("@BeforeMethod",true);
	}
	
	@AfterMethod//executes after every test method
	public void logout()
	{
		Reporter.log("@AfterMethod",true);
	}
	
}
