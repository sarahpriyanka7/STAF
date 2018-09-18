package PageAction;

import org.testng.annotations.*;


public class TestNGAnnotationsTest {
	
	@Test(priority = 2)
	public void method1()
	{
		System.out.println("this is Method1");
	}
	@Test(priority = 3)
	public void method2()
	{
		System.out.println("this is Method2");
	}
	@Test(priority = 1)
	public void method3()
	{
		System.out.println("this is Method3");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("This is BeforeTest");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This is AfterTest");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This is BeforeClass");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("This is AfterClass");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("This is BeforeMethod");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("This is AfterMethod");
	}

	
}
