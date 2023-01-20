package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class BeforeClassIsFailingTest
{


@BeforeClass
public void before() {
throw new RuntimeException("in before class");
}

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue1()
    {
        assertTrue( true );
    }


}
