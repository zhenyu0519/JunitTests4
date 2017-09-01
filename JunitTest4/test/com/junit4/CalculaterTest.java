//parameterized test
package com.junit4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//declare the parameterized class
@RunWith(Parameterized.class)
public class CalculaterTest {

	private int expected;
	private int input1;
	private int input2;
	private Calculater cal;
	
	@Before
	public void setUp(){
		cal = new Calculater();
	}
	//create the expected value and input value pair and set them as parameters
	@Parameters
	public static Collection prepareData(){
		Object[][] object ={{3,1,2},{-4,-1,-3},{5,1,4}};
		return Arrays.asList(object);
	}
	//constructor to connect with collection
	public CalculaterTest(int expected, int input1, int input2){
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}
	//Test the add method
	@Test
	public void testAdd(){
		assertEquals(this.expected, cal.add(this.input1, this.input2));
	}
}
