package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderofExecution {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("OrderofExecution->1-before suit");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("OrderofExecution->1-before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("OrderofExecution->1-before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("OrderofExecution->1-before method");
	}

	@Test

	public void test1() {
		System.out.println("OrderofExecution->1-Test method 1 ");
	}

	@Test

	public void test2() {
		System.out.println("OrderofExecution->1-Test method 2 ");
	}

	@Test

	public void test3() {
		System.out.println("order of execution-> test method 3");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("OrderofExecution->1-After method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("OrderofExecution->1-After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("OrderofExecution->1-After Test");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("OrderofExecution->1-After suit");
	}

}
