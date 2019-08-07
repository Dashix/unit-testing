package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalcTest extends BaseTestForTestNg {

    @Test(groups = "sin_cos")
    public void testSin() {
        double a = 8.0;
        double expectedResult = Math.sin(a);

        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of sin method:");
    }

}
