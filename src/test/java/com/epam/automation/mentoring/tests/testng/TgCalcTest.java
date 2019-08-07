package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalcTest extends BaseTestForTestNg {

    @Test(groups = "tg_ctg")
    public void testTg() {
        double a = 8.0;
        double expectedResult = Math.tan(a);

        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of tg method:");
    }

}
