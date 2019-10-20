package testNG;

import org.testng.annotations.Test;

public class NewDemoTests {

	@Test(groups = { "windows.checkintest" })
	public void testWindowsOnly() {
	}

	@Test(groups = { "linux.checkintest" })

	public void test2() {
		System.out.println("OrderofExecution->1-Test method 2 ");
	}

	@Test(groups = { "windows.functest" })

	public void test3() {
		System.out.println("order of execution-> test method 3");
	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod1() {
		System.out.println("111");
	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod2() {
		System.out.println("22");
	}

	@Test(groups = { "functest" })
	public void testMethod3() {
		System.out.println("3333");
	}

}
