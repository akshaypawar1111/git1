package Openbrowser;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 
{

	
	
	@AfterClass
	public void addition()
	{
		
		
		System.out.println("runnuing addition");
	}
	
	@Test(invocationCount = 5)
	public void addition1()
	{
		
		
		System.out.println("runnuing addition1 ");
	}
	
	
	
	@BeforeTest()
	public void subtraction()
	{
		
		
		System.out.println("runnuing subtraction");
	}
	
	
	@Test(priority = 1)
	public void multi()
	{
		
		String a="akshay";
		String b="akshay";
		
		Assert.assertEquals(a, b);
		//System.out.println("running multi");
	}
	
	
	
	
	
}
