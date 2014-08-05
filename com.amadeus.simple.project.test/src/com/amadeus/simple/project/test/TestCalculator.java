package com.amadeus.simple.project.test;

import org.junit.Assert;
import org.junit.Test;

import com.amadeus.simple.project.Calculator;

/**
 * Calculator Test.
 * 
 * @author njayarama
 *
 */
public class TestCalculator {
	

	@Test
	public void testAddValues() {
		
		Calculator calculator = new Calculator();
		
		long result = calculator.addValues(4, 5);
		Assert.assertEquals(9, result);
		
		result = calculator.addValues(5, 4);
		Assert.assertEquals(9, result);
	}

	@Test
	public void testMultiplyValues() {
		Calculator calculator = new Calculator();
		
		long result = calculator.multiplyValues(4, 5);
		Assert.assertEquals(20, result);
		
		result = calculator.multiplyValues(5, 4);
		Assert.assertEquals(20, result);
	}
}
