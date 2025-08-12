package day21;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo8 {

	@DataProvider
	public Iterator<String> getData()
	{
		ArrayList<String> user=new ArrayList<String>();
		user.add("Asha");
		user.add("Bindu");
		user.add("Chandana");
		Iterator<String> a = user.iterator(); //3 rows 1 col
		return a;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un)
	{
		Reporter.log("Create User:"+un,true);
		
	}
}
