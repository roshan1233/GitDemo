package day22;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeClass
	public void openApp()
	{
		Reporter.log("open app",true);
	}
	
	@AfterClass
	public void closeApp()
	{
		Reporter.log("close app",true);
	}
	
	@AfterMethod//executes after every test method
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@BeforeMethod//executes before every test method
	public void login()
	{
		Reporter.log("Login",true);
	}
	@Test
	public void createCustomer()
	{
		Reporter.log("Create Customer",true);
	}
	
	@Test
	public void deleteCustomer()
	{
		Reporter.log("Delete Customer",true);
	}
}
