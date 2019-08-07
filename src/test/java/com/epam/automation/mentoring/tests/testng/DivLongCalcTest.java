package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivLongCalcTest extends BaseTestForTestNg {

    @Test
    public void testDivisionWithLongParameters() {
        long a = 9L;
        long b = 3L;
        long expectedResult = 3L;

        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of div method:");
    }
}
