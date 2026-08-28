package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayProcessorStatementTest {

    @Test
    public void testNullArray() {
        // Covers: if (array == null) -> return 0
        assertEquals(0, ArrayProcessor.process(null));
    }

    @Test
    public void testArrayWithEvenAndOdd() {
        // Covers the rest of the statements: loop, if (even), else (odd), return sum
        int[] input = {2, 3};
        // 2 is even -> sum = 2
        // 3 is odd -> sum = 2 - 3 = -1
        assertEquals(-1, ArrayProcessor.process(input));
    }
}
