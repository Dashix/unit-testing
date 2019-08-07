package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveCalcTest extends BaseTestForTestNg {

    @Test
    public void testIsPositiveWithPositiveNumber() {
        long a = 25L;
        Assert.assertTrue(calculator.isPositive(a), "Invalid result of isPositive method:");
    }

    @Test
    public void testIsPositiveWithNegativeNumber() {
        long a = -5L;
        Assert.assertFalse(calculator.isPositive(a), "Invalid result of isPositive method:");
    }
}
