package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class DivDoubleCalcTest extends BaseTestForJUnit {

    @Test
    public void testDivisionWithDoubleParameters() {
        double a = 6.0;
        double b = 1.5;
        double expectedResult = 4.0;

        double result = calculator.div(a, b);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }
}
