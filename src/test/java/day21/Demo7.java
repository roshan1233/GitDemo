package day21;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo7 {

	@DataProvider
	public String[][] getData()
	{
		String[][] user=new String[3][2] ;
		
		user[0][0]="UserA";
		user[0][1]="A123";
		
		user[1][0]="UserB";
		user[1][1]="B123";
		
		user[2][0]="UserC";
		user[2][1]="C123";
		
		return user;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un,String pw)
	{
		Reporter.log("Create User:"+un+" with pw:"+pw,true);
	}
}
