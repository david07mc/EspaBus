package org.Iteration1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Iteration1 extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test_Iteration1( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Test_Iteration1.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}