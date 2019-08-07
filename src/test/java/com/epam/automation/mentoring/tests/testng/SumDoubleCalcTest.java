package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleCalcTest extends BaseTestForTestNg {

    @Test
    public void testSumWithDoubleParameters() {
        double a = 4.0;
        double b = 1.5;
        double expectedResult = 5.5;

        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sum method:");
    }
}
