package com.epam.automation.mentoring.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestForTestNg {

    protected Calculator calculator;

    @BeforeClass(groups = "base")
    public void setup() {
        calculator = new Calculator();
    }

    @AfterClass(groups = "base")
    public void tearDown() {
        calculator = null;
    }
}
