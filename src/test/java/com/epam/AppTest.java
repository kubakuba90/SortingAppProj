package com.epam;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for App
 */
public class AppTest 
{
    protected App app = new App();
    /**
     * Corner tests 1 - Corner cases with zero and one arguments
     */
    @Test (expected = NumberFormatException.class)
    public void testZeroCase(){
        String emptySign = ""; //send to the method
        assertEquals(new ArrayList<>(), app.sortApp(emptySign));
    }

    @Test
    public void testOneArgument(){
        ArrayList<Integer> arrayExpected = new ArrayList<>();
        arrayExpected.add(7);
        assertEquals(arrayExpected, app.sortApp("7"));
    }

}
