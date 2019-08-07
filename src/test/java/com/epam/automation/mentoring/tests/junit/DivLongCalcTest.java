package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.junit.Assert;
import org.junit.Test;

public class DivLongCalcTest extends BaseTestForJUnit {

    @Test
    public void testDivisionWithLongParameters() {
        long a = 9L;
        long b = 3L;
        long expectedResult = 3L;

        long result = calculator.div(a, b);
        Assert.assertEquals(expectedResult, result);
    }
}
