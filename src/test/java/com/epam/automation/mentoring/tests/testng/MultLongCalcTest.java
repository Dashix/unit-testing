package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultLongCalcTest extends BaseTestForTestNg {

    @Test
    public void testMultiplicationWithLongParameters() {
        long a = 2L;
        long b = 5L;
        long expectedResult = 10L;

        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of mult method:");
    }
}
