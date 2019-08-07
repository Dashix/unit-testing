package com.epam.automation.mentoring.tests;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTestForJUnit {

    protected static Calculator calculator;

    @BeforeClass
    public static void setup() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }
}
