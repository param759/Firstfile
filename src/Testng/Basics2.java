package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Basics2 {
@Parameters({"URL", "pol"})
@Test(groups= {"smoke"})
	public void Test(String url, String hell)
	{
	System.out.println("KIda");
	System.out.println(url);
	System.out.println(hell);
	}
}
