package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.junit.Assert;
import org.junit.Test;

public class NegativeCalcTest extends BaseTestForJUnit {

    @Test
    public void testIsNegativeWithNegativeNumber() {
        long a = -40L;
        Assert.assertTrue(calculator.isNegative(a));
    }

    @Test
    public void testIsNegativeWithPositiveNumber() {
        long a = 30L;
        Assert.assertFalse(calculator.isNegative(a));
    }
}
