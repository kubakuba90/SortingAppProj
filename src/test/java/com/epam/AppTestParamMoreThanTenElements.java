package com.epam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;
import static org.junit.Assert.assertEquals;

/**
 * Parametrized more than 10 arguments test for App.
 */
@RunWith(value = Parameterized.class)
public class AppTestParamMoreThanTenElements {

    private String numbers;
    private Integer[] list;
    protected App app = new App();

    public AppTestParamMoreThanTenElements(String numbers, Integer[] list) {
        this.numbers = numbers;
        this.list = list;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1 2 3 4 5 6 7 8 10 9 11", new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 11}},
                {"3 2 1 4 5 6 7 8 9 10 11 12 13", new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 11, 12, 13}}
        });
    }

    @Test (expected = RuntimeException.class)
    public void testTenArguments() {
        ArrayList<Integer> newExpectedArrayList = new ArrayList<>();
        Collections.addAll(newExpectedArrayList, list);
        assertEquals(app.sortApp(numbers), newExpectedArrayList);
    }

}
