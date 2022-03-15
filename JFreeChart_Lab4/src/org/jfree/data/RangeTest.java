package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RangeTest{

    private double upper;
    private double lower; 
    private Range testRange;

    @Before
    public void setUp() throws Exception{
        upper = 1.0;
        lower = 10.0;
    }

    @Test(expected = Exception.class)
    public void incorrectConstructorRangeTest(){
        testRange = new Range(lower, upper);

    }
    
    @Test
    public void correctConstructorLowerRangeTest(){
        testRange = new Range(upper , lower);
        assertEquals("Lower is wrong", 1.0, testRange.getLowerBound(), 0.0000001d);
    }
    
    @Test
    public void correctConstructorUpperRangeTest(){
        testRange = new Range(upper , lower);
        assertEquals("Lower is wrong", 10.0, testRange.getUpperBound(), 0.0000001d);
    }
            
    @After
    public void tearDown() throws Exception {}

}