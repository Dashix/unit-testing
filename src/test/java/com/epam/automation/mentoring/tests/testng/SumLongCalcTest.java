package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumLongCalcTest extends BaseTestForTestNg {

    @Test
    public void testSumWithLongParameters() {
        long a = 2L;
        long b = 15L;
        long expectedResult = 17L;

        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sum method:");
    }
}
