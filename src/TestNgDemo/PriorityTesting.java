package TestNgDemo;

import org.testng.annotations.Test;

public class PriorityTesting {
	
	@Test(priority = 1, invocationCount = 4)
	public void test()
	{
		System.out.println("hello");
	}
	@Test(priority = 3)
	public void sample()
	{
		System.out.println("hi");
	}
	@Test(priority = 2)
	public void demo()
	{
		System.out.println("bye");
	}


}
