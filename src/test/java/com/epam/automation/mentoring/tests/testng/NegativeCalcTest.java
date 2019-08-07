package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeCalcTest extends BaseTestForTestNg {

    @Test
    public void testIsNegativeWithNegativeNumber() {
        long a = -40L;
        Assert.assertTrue(calculator.isNegative(a), "Invalid result of isNegative method:");
    }

    @Test
    public void testIsNegativeWithPositiveNumber() {
        long a = 30L;
        Assert.assertFalse(calculator.isNegative(a), "Invalid result of isNegative method:");
    }
}
