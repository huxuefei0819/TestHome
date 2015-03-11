package com.tdc.smoke;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.tdc.groups.SmokeTests;

public class HomePageSmokeTest {
	@Category({ SmokeTests.class })
	@Test
	public void testHomePageAvailable() throws Exception {
		String fileName = System.getProperty("testDataFilename");
		System.out.println("Message: testHomePageAvailable uses file: " + fileName);
		assertTrue(true);
	}

	@Category({ SmokeTests.class })
	@Test
	public void testHomepageContainsLogo() throws Exception {
		String fileName = System.getProperty("testDataFilename");
		System.out.println("Message: testHomepageContainsLogo uses file: " + fileName);
		assertTrue(true);
	}
}
