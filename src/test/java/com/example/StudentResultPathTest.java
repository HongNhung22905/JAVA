package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StudentResultPathTest {
    @Test
    void pathEmptyInput() {
        assertEquals("INVALID", StudentResult.classify(new double[]{}));
    }

    @Test
    void pathInvalidAtFirstLoopIteration() {
        assertEquals("INVALID", StudentResult.classify(new double[]{-1, 8, 9}));
    }

    @Test
    void pathInvalidAfterValidLoopIteration() {
        assertEquals("INVALID", StudentResult.classify(new double[]{8, 11, 9}));
    }

    @Test
    void pathExcellentAfterLoop() {
        assertEquals("EXCELLENT", StudentResult.classify(new double[]{8, 8, 8}));
    }

    @Test
    void pathPassAfterLoop() {
        assertEquals("PASS", StudentResult.classify(new double[]{5, 5, 5}));
    }

    @Test
    void pathFailAfterLoop() {
        assertEquals("FAIL", StudentResult.classify(new double[]{4, 4, 4}));
    }
}
