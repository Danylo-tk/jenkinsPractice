package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharacterCounterTest {

    @Test
    public void testCountCharacters() {
        String input = "Hello, World!";
        int expectedCount = 15;

        int actualCount = Counter.count(input);

        assertEquals(expectedCount, actualCount);
    }
}
