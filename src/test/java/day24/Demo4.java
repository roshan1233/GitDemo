package day24;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
	
	//How do u execute delete user after register user?
	//ANS: using priority
		@Test(priority = 1)
		public void registerUser()
		{
			Reporter.log("Register User",true);
		}
		
		@Test(priority = 2)
		public void deleteUser()
		{
			Reporter.log("Delete User",true);
		}
		

}
