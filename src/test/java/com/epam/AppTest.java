package com.epam;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for App
 */
//@RunWith(Parameterized.class)
public class AppTest 
{
    protected App app = new App();

    /**
     * Corner tests 1 -Corner cases with zero arguments
     */
    @Test (expected = NumberFormatException.class)
    public void testZeroCase(){
        String emptySign = ""; //send to the method
        Integer zeroNull = null; //send to arrayExpected

        ArrayList<Integer> arrayExpected = new ArrayList<>();
        arrayExpected.add(zeroNull);

        assertEquals(arrayExpected, app.sortApp(emptySign));
    }

    @Test
    public void testOneArgument(){
        ArrayList<Integer> arrayExpected = new ArrayList<>();
        arrayExpected.add(7);

        assertEquals(arrayExpected, app.sortApp("7"));
    }


}
