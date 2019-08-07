package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalcTest extends BaseTestForTestNg {

    @Test(groups = "tg_ctg")
    public void testCtg() {
        double a = 8.0;
        double expectedResult = 1.0 / Math.tan(a);

        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of ctg method:");
    }
}
