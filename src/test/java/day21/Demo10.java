
package day21;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo10 {

	@DataProvider
	public Object[] getData()
	{
		Object[] user= new Object[3];
		user[0]="UserA";
		user[1]=1234;
		user[2]=true;
		
		return user;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(Object un)
	{
		Reporter.log("Create User:"+un,true);
		
	}
}
