package genericUtils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {

	@BeforeSuite
	public void bs() {
		System.out.println("This is before suite");
	}
	@BeforeClass
	public void bc() {
		System.out.println("This is before class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("This is before method");
	}
	@AfterMethod
	public void am() {
		System.out.println("This is after method");
	}
	@AfterClass
	public void ac() {
		System.out.println("This is after class");
	}
	@AfterSuite
	public void as() {
		System.out.println("This is after suite");
	}
	@Test
	public void testCase1() {
		System.out.println("This is test case1");
	}
	
}
