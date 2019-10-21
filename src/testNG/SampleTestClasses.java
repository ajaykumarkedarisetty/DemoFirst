package testNG;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.Test;

public class SampleTestClasses {

	@Test
	public void testpass() {
		System.out.println("test passed!");
		assertTrue(true);
	}

	@Test(retryAnalyzer = testNG.RetryAnalyzer.class)
	public void testFailed() {
		System.out.println("test failed!");
		assertTrue(false);
	}

	@Test(enabled=false)
	public void testMayFail() {
		int i = new Random().nextInt(10);
		System.out.println("test may fail! - " + i);
		if (i > 5)
			assertTrue(false);
		else
			assertTrue(true);
	}

}
