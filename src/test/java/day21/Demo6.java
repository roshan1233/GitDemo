package day21;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo6 {

	@DataProvider
	public String[] getData()
	{
		String[] user= {"Arjun","Sunitha","Ambika","Ravi","Chandra"};
		return user;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un)
	{
		Reporter.log("Create User:"+un,true);
		
	}
}
