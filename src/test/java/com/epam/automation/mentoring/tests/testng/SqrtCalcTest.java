package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtCalcTest extends BaseTestForTestNg {

    @Test
    public void testSqrt() {
        double a = 8.0;
        double expectedResult = Math.sqrt(a);

        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of sqrt method:");
    }

}
