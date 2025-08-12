package day21;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	final int i=3;
	@Test(priority = i)
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
		
	}
	
	@Test(priority = -2)
	public void registerUser()
	{
		Reporter.log("Register User",true);
		
	}

	@Test
	public void editUser()
	{
		Reporter.log("Edit User",true);
		
	}

	
	
}
