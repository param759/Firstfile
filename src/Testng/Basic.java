package Testng;

import org.testng.annotations.Test;

public class Basic {
@Test(groups= {"smoke"})
	 public void Demo()
	 {
		// TODO Auto-generated method stub
		 System.out.println("hello");

	}

@Test
public void Demo1()
{
System.out.println("bye");
}

@Test
public void Demo2()
{
	System.out.println("hell");
}
}