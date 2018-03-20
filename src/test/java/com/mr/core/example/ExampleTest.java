package com.mr.core.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Example.
 */
public class ExampleTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ExampleTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ExampleTest.class );
    }

    /**
     * Rigourous Test
     */
    public void testConstruct()
    {
        Rectangle testRect = new Rectangle();

        // Test Constructor: everything is 0
        assertTrue(testRect.getArea()==0.0);
        assertTrue(testRect.getPerimeter()==0.0);
    }

    public void testGetSet()
    {
        Rectangle testRect = new Rectangle();

        // test get/set
        testRect.setWidth(2.0);
        testRect.setHeight(3.5);

        assertTrue(testRect.getWidth()==2.0);
        assertTrue(testRect.getHeight()==3.5);
    }

    public void testCalc()
    {
        Rectangle testRect = new Rectangle();

        // test get/set
        testRect.setWidth(2.0);
        testRect.setHeight(3.5);

        assertTrue(testRect.getArea()==7.0);
        assertTrue(testRect.getPerimeter()==11);
    }
}
