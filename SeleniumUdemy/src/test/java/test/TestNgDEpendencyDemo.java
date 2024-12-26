package test;

import org.testng.annotations.Test;

public class TestNgDEpendencyDemo {
	
	@Test(dependsOnGroups =  {"sanity.*"})
	public void test1()
	{
		System.out.println("I am inside test 01");
	}
	@Test(groups = {"sanity1"})
	public void test2()
	{
		System.out.println("I am inside test 02");
	}
	@Test(groups = {"sanity2"})
	public void test3()
	{
		System.out.println("I am inside test 03");
	}
}
