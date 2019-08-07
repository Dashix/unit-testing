package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MultDoubleCalcTest extends BaseTestForJUnit {

    @Test
    public void testMultiplicationWithDoubleParameters() {
        double a = 2.0;
        double b = 4.5;
        double expectedResult = 9.0;

        double result = calculator.mult(a, b);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }
}
