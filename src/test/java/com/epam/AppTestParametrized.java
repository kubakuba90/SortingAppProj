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
    private static ArrayList<Integer> arrayExpected;
    protected App app = new App();

    public AppTestParametrized(String numbers, ArrayList<Integer> arrayExpected) {
        this.numbers = numbers;
        this.arrayExpected = arrayExpected;
    }

    //List<Integer> listOfSortedParams = new ArrayList<>();
    int array[] = {0, 1, 1, 2, 3, 4, 6, 10, 16, 99};

//Collections.addAll(arrayExpected, 0, 1, 1, 2, 3, 4, 6, 10, 16, 99)
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"4 1 3 6 99 0 1 2 16 10", arrayExpected.addAll() }
               // {"66 77 33 111 99 22 1 26 16 100", Collections.addAll(arrayExpected, 1, 16, 22, 26, 33, 66, 77, 99, 100, 111)}
        });
    }

    @Test
    public void testTenArguments() {
        assertEquals(app.sortApp(numbers), arrayExpected);
    }

    // class MathUtils{
    // public static int add(int a, int b) {
    //      return a+b;
    // }
}
