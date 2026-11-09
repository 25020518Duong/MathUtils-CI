package com.practice.ci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Executing add: {} + {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Divide by zero attempt: {} / {}", a, b);
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        logger.info("Executing divide: {} / {}", a, b);
        return a / b;
    }

    public static void main(String[] args) {
        MathUtils app = new MathUtils();
        logger.info("Application starting...");
        int result = app.add(15, 25);
        logger.info("Sample Calculation Result: {}", result);
    }
}