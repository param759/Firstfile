package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Global{
 @Test(dataProvider="trans")
 public void good(String username,String valaue)
 {
	 System.out.println("hello");
	 System.out.println(username);
	 System.out.println(valaue);
 }
 @DataProvider
 public Object[][] trans()
 {
	 Object[][] abc= new Object[3][2];
	 abc[0][0]="username";
	 abc[0][1]="password";
	 abc[1][0]="username";
	 abc[1][1]="password";
	 abc[2][0]="username";
	 abc[2][1]="password";
	 return abc;
 }
}
