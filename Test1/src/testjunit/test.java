package testjunit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("before each");
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	
	
	@AfterClass
	public static void affterClass() {
		System.out.println("after class");
	}
	
	@AfterAll
	public static void affterAll() {
		System.out.println("after all");
	}
	
	@AfterEach
	public void affterEach() {
		System.out.println("after each");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@Test
	public void test1() {
		System.out.println("test");
		String obj1="Junit";
		String obj2="Junit";
		assertEquals(obj1,obj2);
	}
	
	@Test
	public void test2() {
		System.out.println("test");
		String obj1="Junit";
		String obj2="Junit";
		assertEquals(obj1,obj2);
	}
}
