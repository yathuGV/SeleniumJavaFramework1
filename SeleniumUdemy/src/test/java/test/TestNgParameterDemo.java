package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterDemo {
	
	 @Test
	 @Parameters({"myName"})
	public void test(@Optional("defName") String name)
	{
		System.out.println("name is : " + name);
	}

}
