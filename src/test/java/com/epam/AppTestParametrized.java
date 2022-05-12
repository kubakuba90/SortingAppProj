package com.epam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;


/**
 * Parametrized 10 arguments test for App.
 */
@RunWith(value = Parameterized.class)
public class AppTestParametrized {

    private String numbers;
    private static ArrayList<Integer> arrayExpected = new ArrayList<>();
    protected App app = new App();

    public AppTestParametrized(String numbers, ArrayList<Integer> arrayExpected) {
        this.numbers = numbers;
        this.arrayExpected = arrayExpected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collections.addAll(arrayExpected, 0, 1, 1, 2, 3, 4, 6, 10, 16, 99);
        return Arrays.asList(new Object[][]{
                {"4 1 3 6 99 0 1 2 16 10", arrayExpected}
        });
    }




    @Test
    public void testTenArguments() {
        assertEquals(app.sortApp(numbers), arrayExpected);
    }


}
