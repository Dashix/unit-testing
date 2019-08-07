package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubDoubleCalcTest extends BaseTestForTestNg {

    @Test
    public void testSubtractionWithDoubleParameters() {
        double a = 5.0;
        double b = 3.5;
        double expectedResult = 1.5;

        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sub method:");
    }
}
