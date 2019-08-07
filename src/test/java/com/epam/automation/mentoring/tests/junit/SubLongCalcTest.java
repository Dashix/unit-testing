package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.junit.Assert;
import org.junit.Test;

public class SubLongCalcTest extends BaseTestForJUnit {

    @Test
    public void testSubtractionWithLongParameters() {
        long a = 12L;
        long b = 4L;
        long expectedResult = 8L;

        long result = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result);
    }
}
