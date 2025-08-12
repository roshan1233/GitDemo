package day24;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {
	//How do u execute 'delete user' after register user is PASSED?

		@Test
		public void registerUser()
		{
			Reporter.log("Register User",true);
			Assert.fail();
		}
		
		@Test(dependsOnMethods = "registerUser")
		public void deleteUser()
		{
			Reporter.log("Delete User",true);
		}
}
