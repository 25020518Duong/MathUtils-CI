package com.practice.ci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    @DisplayName("Test addition of two positive integers")
    void testAdd() {
        int sum = mathUtils.add(10, 20);
        Assertions.assertEquals(30, sum, "10 + 20 must equal 30");
    }

    @Test
    @DisplayName("Test division with non-zero denominator")
    void testDivideSuccess() {
        int quotient = mathUtils.divide(20, 4);
        Assertions.assertEquals(5, quotient, "20 / 4 must equal 5");
    }

    @Test
    @DisplayName("Test division by zero throwing IllegalArgumentException")
    void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.divide(10, 0);
        });
    }
}