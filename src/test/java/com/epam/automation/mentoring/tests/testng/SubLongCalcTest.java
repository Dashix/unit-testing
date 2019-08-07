package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubLongCalcTest extends BaseTestForTestNg {

    @Test
    public void testSubtractionWithLongParameters() {
        long a = 12L;
        long b = 4L;
        long expectedResult = 8L;

        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sub method:");
    }
}
