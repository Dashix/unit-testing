package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.junit.Assert;
import org.junit.Test;

public class MultLongCalcTest extends BaseTestForJUnit {

    @Test
    public void testMultiplicationWithLongParameters() {
        long a = 2L;
        long b = 5L;
        long expectedResult = 10L;

        long result = calculator.mult(a, b);
        Assert.assertEquals(expectedResult, result);
    }
}
