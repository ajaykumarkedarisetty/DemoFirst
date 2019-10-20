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

public class OrderofExecution2 {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("OrderofExecution->2- before suit");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("OrderofExecution->2-before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("OrderofExecution->2-before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("OrderofExecution->2-before method");
	}

	@Test
	public void test1() {
		System.out.println("OrderofExecution->2-Test method 1 ");
	}

	@Test
	public void test2() {
		System.out.println("OrderofExecution->2-Test method 2 ");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("OrderofExecution->2-After method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("OrderofExecution->2-After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("OrderofExecution->2-After Test");
	}

	@AfterSuite
	public void afterSuit() {
		System.out.println("OrderofExecution->2-After suit");
	}

}
