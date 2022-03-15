package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class centralValueTests {

	private Range mixedRange;
	private Range negativeRange;
	private Range positiveRange;

	private Range zeroRange;
	
	@Before
	public void setUp() throws Exception {
		mixedRange = new Range(-1,2);
		negativeRange = new Range(-0.6,-0.2);
		positiveRange  = new Range(1.5,3.5);
		zeroRange = new Range(0,0);
	}
	
	@Test
	public void testMixedRange() {
		double actual = mixedRange.getCentralValue();
		assertEquals("Testing mixed central value", 0.5, actual,0.0000001d);
		
	}
	
	@Test
	public void testPositiveRange() {
		double actual = positiveRange.getCentralValue();
		assertEquals("Testing mixed central value", 2.5, actual,0.0000001d);
		
	}

	@Test
	public void testNegativeRange() {
		double actual = negativeRange.getCentralValue();
		assertEquals("Testing mixed central value", -0.4, actual,0.0000001d);
		
	}

	@Test
	public void testzeroRange() {
		double actual = zeroRange.getCentralValue();
		assertEquals("Testing mixed central value", 0, actual,0.0000001d);
		
	}


}
