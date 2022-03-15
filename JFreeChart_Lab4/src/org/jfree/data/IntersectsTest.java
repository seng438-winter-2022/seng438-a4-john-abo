package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntersectsTest {
    private Range positiveRange;
    private Range testRange;
    private Range testRange2;
    private double testValue1;
    private double testValue2;
    private double testValue3;
    private double testValue4;
    private double testValue5;
    private double testValue6;
    private double testValue7;
    private double testValue8;
    private double testValue9;
    @Before
	public void setUp() throws Exception {
        positiveRange = new Range(5.6,20.8);
        testRange = new Range(-10.0,20.0); 
        testRange2 = new Range(4.9,7.9);
        testValue1 = 4.9;
        testValue2 = 7.9;
        testValue3 = 27.9;
        testValue4 = -10.2;
        testValue5 = 27.9;
        testValue6 = 5.6;
        testValue7 = 20.8;
        testValue8 = 5.5;
        testValue9 = 5.7;
	}
    
    @Test
    public void b0EqualsLowerBound() {
    	boolean expected = false;
    	boolean actual = positiveRange.intersects(testValue6,testValue6);
    	assertEquals(expected,actual);
    	
    	
    }
    
    @Test
    public void b0EqualsLowerBoundTrue() {
    	boolean expected = true;
    	boolean actual = positiveRange.intersects(testValue8,testValue9);
    	assertEquals(expected,actual);
    	
    	
    }
    
    @Test
    public void b0equalsUpper() {
    	boolean expected= false;
    	boolean actual = testRange2.intersects(testValue2,testValue2);
    	assertEquals(expected,actual);
    	
    	
    	
    }
    
    @Test
    public void b0equalb1() {
    	boolean expected= true;
    	boolean actual = testRange2.intersects(testValue6,testValue6);
    	assertEquals(expected,actual);
    	
    	
    	
    }
   
    @Test
    public void b1equalLower() {
    	boolean expected = false;
    	boolean actual = positiveRange.intersects(testValue1, testValue6);
    	assertEquals(expected,actual);
    }
    
    @Test
    public void b1equalLowerTrue() {
    	boolean expected = true;
    	boolean actual = positiveRange.intersects(testValue1, testValue9);
    	assertEquals(expected,actual);
    }
    
    @Test
    public void b1LessThanb0() {
    	boolean expected = false;
    	boolean actual = positiveRange.intersects(testValue9, testValue8);
    	assertEquals(expected,actual);
    }
    
    
    @Test
    public void b0greaterThanLower() {
    	boolean expected = false;
    	boolean actual = testRange2.intersects(testValue7,testValue5);
    	assertEquals(expected,actual);
    }
    
    @Test
    public void b1LessThanLower() {
    	boolean expected = false;
    	boolean actual = testRange2.intersects(testValue4,testValue4);
    	assertEquals(expected,actual);
    }

   @Test
   public void b0greaterThanLowerb0EqualsUpper() {
	   boolean expected = false;
	   boolean actual = testRange2.intersects(testValue2,testValue6);
	   assertEquals(expected,actual);
   }
   
   @Test
   public void b0greaterThanLowerB1LessThanB0() {
	   boolean expected = false;
	   boolean actual = testRange2.intersects(testValue3,testValue1);
	   assertEquals(expected,actual);
	   
   }

    @Test 
    public void b0LowerOrEqualsB1HigherThan(){
        boolean expected = true;
        boolean actual = positiveRange.intersects(testValue1, testValue2);
        assertEquals(expected, actual);
    }

    @Test 
    public void b0LowerOrEqualsB1LowerThan(){
        boolean expected = false;
        boolean actual = positiveRange.intersects(testValue2, testValue1);
        assertEquals(expected, actual);
    }

    @Test 
    public void b0LowerOrEqualsB1LowerThanNegative(){
        boolean expected = false;
        boolean actual = testRange.intersects(testValue2, testValue4);
        assertEquals(expected, actual);
    }

    @Test 
    public void elseTrueFalseTest(){
        boolean expected = false;
        boolean actual = testRange.intersects(testValue2, testValue1);
        assertEquals(expected, actual);
    }

    @Test 
    public void elseFalseTrueTest(){
        boolean expected = false;
        boolean actual = testRange.intersects(testValue3, testValue5);
        assertEquals(expected, actual);
    }

    @Test 
    public void elseTrueTrueTest(){
        boolean expected = true;
        boolean actual = testRange.intersects(testValue1, testValue3);
        assertEquals(expected, actual);
    }
        
    @After
    public void tearDown() throws Exception {}

}
