package test;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNgGroupDemo {
	
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("twat 01");
	}
	
	@Test(groups = {"sanity", "smoke"})
	public void test2()
	{
		System.out.println("twat 02");
	}
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("twat 03");
	}
	
	@Test(groups = {"window.regression"})
	public void test4()
	{
		System.out.println("testt 04");
	}
	public void test5()
	{
		System.out.println("testt 05");
	}
}
