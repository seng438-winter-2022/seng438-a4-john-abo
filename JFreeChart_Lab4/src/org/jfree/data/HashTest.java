package org.jfree.data;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HashTest {
    private Range testMixedRange;
    private Range testPositiveRange;
    private Range testNegativeRange;
    private Range testZeroRange;
    
    @Before
	public void setUp() throws Exception {
        testMixedRange = new Range(-10, 10);
        testPositiveRange = new Range(12.3, 100.5);
        testNegativeRange = new Range(-7.5, -0.45);
        testZeroRange = new Range(0, 0);
    }

    @Test
    public void hashCodeTestPositive(){
        int actual = testPositiveRange.hashCode();

        // temp = Double.doubleToLongBits(12.3);
        // result = (int) (temp ^ (temp >>> 32));
        // temp = Double.doubleToLongBits(100.5);
        // result = 29 * result + (int) (temp ^ (temp >>> 32));
        // result = expected = -379183017;

        int expected = -379183017;
        assertEquals(expected, actual);
    }

    @Test
    public void hashCodeTestNegative(){
        int actual = testNegativeRange.hashCode();

        // temp = Double.doubleToLongBits(-7.5);
        // result = (int) (temp ^ (temp >>> 32));
        // temp = Double.doubleToLongBits(-0.45);
        // result = 29 * result + (int) (temp ^ (temp >>> 32));
        // result = expected = 913702913;

        int expected = 913702913;
        assertEquals(expected, actual);
    }

    @Test
    public void hashCodeTestZero(){
        int actual = testZeroRange.hashCode();

        // temp = Double.doubleToLongBits(0);
        // result = (int) (temp ^ (temp >>> 32));
        // temp = Double.doubleToLongBits(0);
        // result = 29 * result + (int) (temp ^ (temp >>> 32));
        // result = expected = 0;

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void hashCodeTestmixed(){
        int actual = testMixedRange.hashCode();

        // temp = Double.doubleToLongBits(-10);
        // result = (int) (temp ^ (temp >>> 32));
        // temp = Double.doubleToLongBits(10);
        // result = 29 * result + (int) (temp ^ (temp >>> 32));
        // result = expected = 70778880;

        int expected = 70778880;
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {}
}
