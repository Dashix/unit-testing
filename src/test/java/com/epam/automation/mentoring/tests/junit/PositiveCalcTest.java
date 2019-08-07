package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.junit.Assert;
import org.junit.Test;

public class PositiveCalcTest extends BaseTestForJUnit {

    @Test
    public void testIsPositiveWithPositiveNumber() {
        long a = 25L;
        Assert.assertTrue(calculator.isPositive(a));
    }

    @Test
    public void testIsPositiveWithNegativeNumber() {
        long a = -5L;
        Assert.assertFalse(calculator.isPositive(a));
    }
}
