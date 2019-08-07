package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDoubleCalcTest extends BaseTestForTestNg {

    @Test
    public void testMultiplicationWithDoubleParameters() {
        double a = 2.0;
        double b = 4.5;
        double expectedResult = 9.0;

        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of mult method:");
    }
}
