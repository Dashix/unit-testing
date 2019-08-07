package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalcTest extends BaseTestForTestNg {

    @Test(groups = "sin_cos")
    public void testCos() {
        double a = 8.0;
        double expectedResult = Math.cos(a);

        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of cos method:");
    }

}
