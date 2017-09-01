package com.junit4;

import static org.junit.Assert.*;

import org.junit.*;


public class MaxTest {

	private Max max;
	
	@BeforeClass 
	public static void superSetUp(){
		System.out.println("before class");
	}
	
	@AfterClass
	public static void superTearDown(){
		System.out.println("after class");
	}
	
	@Before
	public void setUp() throws Exception {
		max = new Max(); 
	}

	@Test(timeout = 1)
	public void test1() {
		int [] array = {1,9,-10, 20, 15, 12, 21};
		int result = 0;
		try {
			result = max.getMax(array);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("test failed!");
		}
		assertEquals(21, result);
	}
	
	@Test(expected = Exception.class)
	public void test2() throws Exception {
		int [] array = {};
		int result = max.getMax(array);
		//will not reach to this line because exception throw
		fail("test failed!");
	}
	
	@Test(expected = Exception.class)
	@Ignore("Not ready yet")
	public void test3() throws Exception {
		int [] array = null;
		int result = max.getMax(array);
		//will not reach to this line because exception throw
		fail("test failed!");
	}

}
