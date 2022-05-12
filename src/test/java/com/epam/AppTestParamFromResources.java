package com.epam;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static org.junit.Assert.assertEquals;
/**
 * Arguments from resources - file (optional task)
 */
public class AppTestParamFromResources {
    protected App app = new App();
    String resources;

    public String readResources() throws IOException{
        this.resources = new String(Files.readAllBytes(Paths.get("src/test/resources/numbers.txt")));
        return resources;
        }

        @Test
        public void testArgumentsFromResources() throws IOException {
            ArrayList<Integer> expectedArrayList = new ArrayList<>();
            Collections.addAll(expectedArrayList, 4, 5, 6, 7, 8, 9, 10);
            assertEquals(app.sortApp(readResources()), expectedArrayList);
        }

}