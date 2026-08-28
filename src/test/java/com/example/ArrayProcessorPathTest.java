package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayProcessorPathTest {

    @Test
    public void testPathNullArray() {
        // Path 1: array is null
        assertEquals(0, ArrayProcessor.process(null));
    }

    @Test
    public void testPathEmptyArray() {
        // Path 2: array is empty
        assertEquals(0, ArrayProcessor.process(new int[]{}));
    }

    @Test
    public void testPathEvenNumbersOnly() {
        // Path 3: loop executes, only even branch is taken
        assertEquals(6, ArrayProcessor.process(new int[]{2, 4}));
    }

    @Test
    public void testPathOddNumbersOnly() {
        // Path 4: loop executes, only odd branch is taken
        assertEquals(-8, ArrayProcessor.process(new int[]{3, 5}));
    }

    @Test
    public void testPathMixedNumbers() {
        // Path 5: loop executes, both branches are taken
        assertEquals(-1, ArrayProcessor.process(new int[]{2, 3}));
    }
}
