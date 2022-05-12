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
public class AppTestParam {

    private String numbers;
    private Integer[] list;
    protected App app = new App();

    public AppTestParam(String numbers, Integer[] list) {
        this.numbers = numbers;
        this.list = list;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"4 1 3 6 99 0 1 2 16 10", new Integer[]{0, 1, 1, 2, 3, 4, 6, 10, 16, 99}},
                {"9 99 999 11 1 111 5 55 5 6", new Integer[]{1, 5, 5, 6, 9, 11, 55, 99, 111, 999}}
        });
    }

    @Test
    public void testTenArguments() {
        ArrayList<Integer> newExpectedArrayList = new ArrayList<>();
        Collections.addAll(newExpectedArrayList, list);
        assertEquals(app.sortApp(numbers), newExpectedArrayList);
    }
}
