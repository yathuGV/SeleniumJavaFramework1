package test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNgFailedDemo {
	
	@Test
	public void test1()
	{
		System.out.println("test 01");
	}
	
	@Test
	public void test2()
	{
		System.out.println(" this is test 02");
		int i= 1/0;
		
	}
	@Test(retryAnalyzer = listenersPackage.RetryAnalyzer.class)

	public void test3()
	{
		System.out.println("this is test 03");
		int i= 12/0;
		
	}
}
