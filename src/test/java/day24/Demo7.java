package day24;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo7 {

	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	@Test(groups = {"user","smoke"})
	public void createUser()
	{
		Reporter.log("createUser",true);
	}
	
	@Test(groups = "user")
	public void editUser()
	{
		Reporter.log("editUser",true);
	}
	
	@Test(groups = "user")
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}
	
	@Test(groups = { "product","smoke"})
	public void createProduct()
	{
		Reporter.log("createProduct",true);
	}
	
	@Test(groups = "product")
	public void editProduct()
	{
		Reporter.log("editProduct",true);
	}
	
	
	@Test(groups = "product")
	public void deleteProduct()
	{
		Reporter.log("deleteProduct",true);
	}
	
	
	@Test(groups = {"customer","smoke"})
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	
	@Test(groups = "customer",enabled = false)
	public void editCustomer()
	{
		Reporter.log("editCustomer",true);
	}
	
	
	@Test(groups = "customer")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
}
