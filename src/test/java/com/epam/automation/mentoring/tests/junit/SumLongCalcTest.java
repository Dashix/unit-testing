package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.junit.Assert;
import org.junit.Test;

public class SumLongCalcTest extends BaseTestForJUnit {

    @Test
    public void testSumWithLongParameters() {
        long a = 2L;
        long b = 15L;
        long expectedResult = 17L;

        long result = calculator.sum(a, b);
        Assert.assertEquals(expectedResult, result);
    }
}
