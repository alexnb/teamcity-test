package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class BeforeIsFailingTest
{


@Before
public void before() {
throw new RuntimeException("in before");
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
