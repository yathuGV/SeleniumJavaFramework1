package listenersPackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listenersPackage.TestNGListeners.class)
public class TestNGListnerDemo {
	
	@Test
	public void test1() {
		System.out.println("test 01");
	}
	@Test
	public void test2() {
		System.out.println("test 02");
	}
	@Test
	public void test3() {
		System.out.println("test 03");
	}

}
