package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleCalcTest extends BaseTestForTestNg {

    @Test
    public void testDivisionWithDoubleParameters() {
        double a = 6.0;
        double b = 1.5;
        double expectedResult = 4.0;

        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of div method:");
    }
}
