package Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loan2 {

	@Test(dependsOnMethods= {"homeloan","carloan"})
	public void bankloan()
	{
		System.out.println("visa");
	}
@Test
public void Test()
{
	System.out.println("All good");
}
@Test
public void homeloan()
{
	System.out.println("Homeloan");

}
@Test
public void carloan()
{
	System.out.println("CarLoan");
}
@Test
public void aersonalloan()
{
	System.out.println("Personalloan");
}
}
