package day21;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
                                                                                                                                                                                        
public class Demo9 {

	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> user=new ArrayList<String[]>() ;
		
		String[] row1= {"UserA","A123"};
		user.add(row1);
		
		String[] row2= {"UserB","B123"};
		user.add(row2);
		
		String[] row3= {"UserC","C123"};
		user.add(row3);
		
		Iterator<String[]> a = user.iterator(); //3R 2 C
		
		return a;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un,String pw)
	{
		Reporter.log("Create User:"+un+" with pw:"+pw,true);
	}
}
