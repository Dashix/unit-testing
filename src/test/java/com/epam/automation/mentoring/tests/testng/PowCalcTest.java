package com.epam.automation.mentoring.tests.testng;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowCalcTest extends BaseTestForTestNg {

    @Parameters({"username"})
    @Test
    public void testPower(@Optional(value = "Dashix") String username) {
        double a = 2.0;
        double b = 3.0;
        double expectedResult = 8.0;

        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of pow method:");
        System.out.println("This test along with the others has been created by " + username);
    }

}
