package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PowCalcTest extends BaseTestForJUnit {

    @Test
    public void testPower() {
        double a = 2.0;
        double b = 3.0;
        double expectedResult = 8.0;

        double result = calculator.pow(a, b);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

}
