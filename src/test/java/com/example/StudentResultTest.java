package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class StudentResultTest {
    @Test
    void nullScoresAreInvalid() {
        assertEquals("INVALID", StudentResult.classify(null));
    }

    @Test
    void emptyScoresAreInvalid() {
        assertEquals("INVALID", StudentResult.classify(new double[]{}));
    }

    @Test
    void invalidNegativeScoreIsRejected() {
        assertEquals("INVALID", StudentResult.classify(new double[]{8, -1, 7}));
    }

    @Test
    void invalidScoreAboveTenIsRejected() {
        assertEquals("INVALID", StudentResult.classify(new double[]{8, 11, 7}));
    }

    @Test
    void excellentAverage() {
        assertEquals("EXCELLENT", StudentResult.classify(new double[]{8, 9, 7}));
    }

    @Test
    void passAverage() {
        assertEquals("PASS", StudentResult.classify(new double[]{5, 6, 4}));
    }

    @Test
    void failAverage() {
        assertEquals("FAIL", StudentResult.classify(new double[]{2, 4, 3}));
    }
}
