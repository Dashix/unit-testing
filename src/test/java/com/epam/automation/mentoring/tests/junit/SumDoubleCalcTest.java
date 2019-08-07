package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SumDoubleCalcTest extends BaseTestForJUnit {

    @Test
    public void testSumWithDoubleParameters() {
        double a = 4.0;
        double b = 1.5;
        double expectedResult = 5.5;

        double result = calculator.sum(a, b);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }
}
