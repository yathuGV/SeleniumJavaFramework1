package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgIgnoreDemo {
	
	@Test
	@Ignore
	public void test1()
	{
		System.out.println(" test o1");
	}
	@Test
	public void test2()
	{
		System.out.println(" test o2");
	}
}
