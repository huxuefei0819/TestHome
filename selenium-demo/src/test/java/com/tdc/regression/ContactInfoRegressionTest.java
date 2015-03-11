package com.tdc.regression;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.tdc.groups.RegressionTests;
import com.tdc.groups.SmokeTests;

// Note: the category annotation can be used on the class level or on the individual test method level.
// The former can make maintenance less of a pain if all tests in class file all belong to the same grouping
// Additionally, you can also add categories to individual tests in conjunction with the class level categorization
@Category({ RegressionTests.class, SmokeTests.class })
public class ContactInfoRegressionTest {
	@Test
	public void testHomeAddress() throws Exception {
		String fileName = "xml/" + System.getProperty("testDataFilename");
		
		//For this test, added an example of reading in our file name
		ClassLoader classLoader = getClass().getClassLoader();
		URL foo = classLoader.getResource(fileName);
		String file = foo.getFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		
		System.out.println("The contents of the XML are:");
		while ((line = br.readLine()) != null) {
			System.out.println("\t" + line);
		}
		br.close();
		
		System.out.println("Message: testHomeAddress uses file: " + fileName);
		assertTrue(true);
	}

	// This line would make testPhoneNumber() run as either a regression or a smoke test
	// @Category({ RegressionTests.class })
	@Test
	public void testPhoneNumber() throws Exception {
		String fileName = System.getProperty("testDataFilename");
		System.out.println("Message: testPhoneNumber uses file: " + fileName);
		assertTrue(true);
	}
}
