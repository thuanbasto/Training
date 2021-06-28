package testjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test2 {
	@BeforeClass
	public static void setUpBefore() throws Exception {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public  void setUp() throws Exception {
		System.out.println("before test");
	}

	@After
	public  void tearDown() throws Exception {
		System.out.println("after test");
	}

	@Test
	public void test1()   {
		System.out.println("test1");
	}
}
