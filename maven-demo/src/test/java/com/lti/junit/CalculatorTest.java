package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.codes.Calculator;

public class CalculatorTest {

	@Test
	public void testIfAddIsWorkingOrNot() {		
		Calculator c = new Calculator();
		int result = c.add(10,20);
		int expected = 30;
		assertEquals(expected,result);
	}
	
	@Test
	public void testIfSubIsWorkingOrNot() {
		Calculator c1 = new Calculator();
		int result1 = c1.sub(20,20);
		int expected1 = 0;
		assertEquals(expected1,result1);
	}
	
}
